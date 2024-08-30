/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9;

/**
 *
 * @author HP
 */
public class TestGraph {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();
        String[] cities = {"Alor Setar", "Kuching", "Langkawi", "Melaka", "Penang", "Tawau"};
        for (String i : cities)
            graph.addVertex(i);

        System.out.println("The number of vertices in graph: " + graph.getSize());

        System.out.println("Cities and their vertices ");
        for (int i = 0; i < graph.getSize(); i++)
            System.out.print(i + ": " + graph.getVertex(i) + "\t");
        System.out.println();

        System.out.println("Is Melaka in the Graph? " + graph.hasVertex("Melaka"));
        System.out.println("Is Ipoh in the Graph? " + graph.hasVertex("Ipoh"));
        System.out.println();

        System.out.println("Kuching at index:  " + graph.getIndex("Kuching"));
        System.out.println("Ipoh at index:  " + graph.getIndex("Ipoh"));
        System.out.println();

        System.out.println("Add edge Kuching - Melaka: " + graph.addEdge("Kuching", "Melaka"));
        System.out.println("Add edge Langkawi - Penang : " + graph.addEdge("Langkawi", "Penang"));
        System.out.println("Add edge Melaka - Penang : " + graph.addEdge("Melaka", "Penang"));
        System.out.println("Add edge Alor Setar - Kuching : " + graph.addEdge("Alor Setar", "Kuching"));
        System.out.println("Add edge Tawau - Alor Setar : " + graph.addEdge("Tawau", "Alor Setar"));
        System.out.println("Add edge Kuching - Tawau : " + graph.addEdge("Kuching", "Tawau"));
        System.out.println("Add edge Langkawi - Ipoh : " + graph.addEdge("Langkawi", "Ipoh"));
        System.out.println();

        System.out.println("Has edge from Kuching to Melaka?  " + graph.hasEdge("Kuching", "Melaka") );
        System.out.println("Has edge from Melaka to Langkawi?  " + graph.hasEdge("Melaka", "Kuching") );
        System.out.println("Has edge from Ipoh to Langkawi?  " + graph.hasEdge("Ipoh", "Langkawi") );
        System.out.println();

        System.out.println("In and out degree for Kuching is " + graph.getIndeg("Kuching") + " and " + graph.getOutdeg("Kuching") );
        System.out.println("In and out degree for Penang is " + graph.getIndeg("Penang") + " and " + graph.getOutdeg("Penang") );
        System.out.println("In and out degree for Ipoh is " + graph.getIndeg("Ipoh") + " and " + graph.getOutdeg("Ipoh") );
        System.out.println();

        System.out.println("Neighbours of Kuching : " + graph.getNeighbours("Kuching"));
        System.out.println("\nPrint Edges : " );
        graph.printEdges();
    }   
}
