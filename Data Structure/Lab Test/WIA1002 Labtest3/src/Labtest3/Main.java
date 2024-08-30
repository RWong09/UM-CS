/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtest3;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Task {
    private String taskName;
    private int estimatedRunTime;
    private List<String> dependencies;

    public Task(String taskName, int estimatedRunTime) {
        this.taskName = taskName;
        this.estimatedRunTime = estimatedRunTime;
        this.dependencies = new ArrayList<>();
    }

    public String getTaskName() {
        return taskName;
    }

    public int getEstimatedRunTime() {
        return estimatedRunTime;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void addDependency(String dependency) {
        dependencies.add(dependency);
    }
}

class WorkflowGraph {
    private Map<String, Task> tasks;

    public WorkflowGraph() {
        tasks = new HashMap<>();
    }

    public void addTask(Task task) {
        tasks.put(task.getTaskName(), task);
    }

    public void addDependency(String parentTaskName, String childTaskName) {
        Task childTask = tasks.get(childTaskName);
        if (childTask != null) {
            childTask.addDependency(parentTaskName);
        }
    }

    public void readInputFiles(String dagFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(dagFile));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.trim().split("\\s+");
            if (parts[0].equals("JOB")) {
                String taskName = parts[1];
                String taskFile = parts[2];
                int estimatedRunTime = readSubFile(taskFile);
                Task task = new Task(taskName, estimatedRunTime);
                addTask(task);
            } else if (parts[0].equals("PARENT")) {
                String parentTaskName = parts[1];
                for (int i = 3; i < parts.length; i++) {
                    addDependency(parentTaskName, parts[i]);
                }
            }
        }

        reader.close();
    }

    private int readSubFile(String subFile) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(subFile));
        String line;
        int estimatedRunTime = 0;

        while ((line = reader.readLine()) != null) {
            if (line.startsWith("estimate_runtime")) {
                estimatedRunTime = Integer.parseInt(line.split("=")[1].trim());
                break;
            }
        }

        reader.close();
        return estimatedRunTime;
    }

    public List<Task> traverseAndSortTasks() {
        List<Task> sortedTasks = new ArrayList<>(tasks.values());
        sortedTasks.sort(Comparator.comparingInt(Task::getEstimatedRunTime));
        return sortedTasks;
    }

    public List<String> findCriticalPath() {
        Map<String, Integer> longestPathLength = new HashMap<>();
        Map<String, List<String>> longestPaths = new HashMap<>();

        for (String taskName : tasks.keySet()) {
            longestPathLength.put(taskName, 0);
            longestPaths.put(taskName, new ArrayList<>());
        }

        List<String> sortedTasks = topologicalSort();
        for (String taskName : sortedTasks) {
            Task task = tasks.get(taskName);
            for (String dep : task.getDependencies()) {
                int currentLength = longestPathLength.get(dep) + task.getEstimatedRunTime();
                if (currentLength > longestPathLength.get(taskName)) {
                    longestPathLength.put(taskName, currentLength);
                    List<String> newPath = new ArrayList<>(longestPaths.get(dep));
                    newPath.add(taskName);
                    longestPaths.put(taskName, newPath);
                }
            }
        }

        String endTask = Collections.max(longestPathLength.entrySet(), Map.Entry.comparingByValue()).getKey();
        return longestPaths.get(endTask);
    }

    private List<String> topologicalSort() {
        List<String> sortedTasks = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Stack<String> stack = new Stack<>();

        for (Task task : tasks.values()) {
            if (!visited.contains(task.getTaskName())) {
                dfs(task.getTaskName(), visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            sortedTasks.add(stack.pop());
        }

        return sortedTasks;
    }

    private void dfs(String taskName, Set<String> visited, Stack<String> stack) {
        visited.add(taskName);
        for (String dep : tasks.get(taskName).getDependencies()) {
            if (!visited.contains(dep)) {
                dfs(dep, visited, stack);
            }
        }
        stack.push(taskName);
    }

    public Task getTask(String taskName) {
        return tasks.get(taskName);
    }
}

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java Main <dagFile>");
            System.exit(1);
        }

        String dagFile = args[0];
        WorkflowGraph graph = new WorkflowGraph();

        try {
            graph.readInputFiles(dagFile);

            System.out.println("Tasks sorted by estimated run time:");
            List<Task> sortedTasks = graph.traverseAndSortTasks();
            for (Task task : sortedTasks) {
                System.out.println("Task " + task.getTaskName() + " : " + task.getEstimatedRunTime());
            }

            List<String> criticalPath = graph.findCriticalPath();
            int totalRunTime = criticalPath.stream().mapToInt(taskName -> graph.getTask(taskName).getEstimatedRunTime()).sum();

            System.out.println("Critical Path: " + String.join(" -> ", criticalPath));
            System.out.println("Total Run Time: " + totalRunTime);
        } catch (IOException e) {
            System.err.println("Error reading input files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}