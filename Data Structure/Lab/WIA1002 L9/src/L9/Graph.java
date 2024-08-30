/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class Graph<T extends Comparable<T>> {
    private Vertex<T> head;
    private int size;

    public Graph() {
        head = null;
        size = 0;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }
    
    public int getIndeg(T v)  {
        for (Vertex<T> current = head; current != null; current = current.nextVertex)
            if (current.vertexInfo.compareTo(v) == 0)
                return current.indeg;
        return -1;
    }

    public int getOutdeg(T v)  {
        for (Vertex<T> current = head; current != null; current = current.nextVertex)
            if (current.vertexInfo.compareTo(v) == 0)
                return current.outdeg;
        return -1;
    }

    public boolean hasVertex(T v)	{
        for (Vertex<T> current = head; current != null; current = current.nextVertex)
            if (current.vertexInfo.compareTo(v) == 0)
                return true;
        return false;
    }

    public boolean addVertex(T v) {
        if (hasVertex(v)) return false;

        Vertex<T> newVertex = new Vertex<>(v, null);
        if (head == null)
            head = newVertex;
        else {
            Vertex<T> current = head;
            while (current.nextVertex != null)
                current = current.nextVertex;
            current.nextVertex = newVertex;
        }
        size++;
        return true;
    }

    public int getIndex(T v) {
        int pos = 0;
        for (Vertex<T> current = head; current != null; current = current.nextVertex, pos++)
            if (current.vertexInfo.compareTo(v) == 0)
                return pos;
        return -1;
    }

    public ArrayList<T> getAllVertexObjects() {
        ArrayList<T> list = new ArrayList<>();
        for (Vertex<T> current = head; current != null; current = current.nextVertex)
            list.add(current.vertexInfo);
        return list;
    }

    public ArrayList<Vertex<T>> getAllVertices() {
        ArrayList<Vertex<T>> list = new ArrayList<>();
        for (Vertex<T> current = head; current != null; current = current.nextVertex)
            list.add(current);
        return list;
    }
    
    public T getVertex(int pos) {
        if (pos < 0 || pos >= size) 
            return null;
        Vertex<T> current = head;
        for (int i = 0; i < pos; i++)
            current = current.nextVertex;
        return current.vertexInfo;
    }

    public boolean addEdge(T source, T destination) {
        if (!hasVertex(source) || !hasVertex(destination)) 
            return false;
        for (Vertex<T> sourceVertex = head; sourceVertex != null; sourceVertex = sourceVertex.nextVertex)
            if (sourceVertex.vertexInfo.compareTo(source) == 0)
                for (Vertex<T> destinationVertex = head; destinationVertex != null; destinationVertex = destinationVertex.nextVertex)
                    if (destinationVertex.vertexInfo.compareTo(destination) == 0) {
                        sourceVertex.firstEdge = new Edge<>(destinationVertex, sourceVertex.firstEdge);
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
        return false;
    }
    
    public boolean addUndirectedEdge(T source, T destination) {
        if (!hasVertex(source) || !hasVertex(destination)) 
            return false;
        for (Vertex<T> sourceVertex = head; sourceVertex != null; sourceVertex = sourceVertex.nextVertex)
            if (sourceVertex.vertexInfo.compareTo(source) == 0)
                for (Vertex<T> destinationVertex = head; destinationVertex != null; destinationVertex = destinationVertex.nextVertex)
                    if (destinationVertex.vertexInfo.compareTo(destination) == 0) {
                        sourceVertex.firstEdge = new Edge<>(destinationVertex, sourceVertex.firstEdge);
                        destinationVertex.firstEdge = new Edge<>(sourceVertex, destinationVertex.firstEdge);
                        sourceVertex.indeg++;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        destinationVertex.outdeg++;
                        return true;
                    }
        return false;
    }

    public boolean hasEdge(T source, T destination) {
        if (!hasVertex(source) || !hasVertex(destination)) 
            return false;
        for (Vertex<T> sourceVertex = head; sourceVertex != null; sourceVertex=sourceVertex.nextVertex)
            if (sourceVertex.vertexInfo.compareTo(source) == 0)
                for (Edge<T> currentEdge = sourceVertex.firstEdge; currentEdge != null; currentEdge = currentEdge.nextEdge)
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0)
                        return true;
        return false;
    }

    public ArrayList<T> getNeighbours(T v) {
        if (!hasVertex(v)) 
            return null;
        ArrayList<T> list = new ArrayList<>();
        for (Vertex<T> current = head; current != null; current = current.nextVertex)
            if (current.vertexInfo.compareTo(v) == 0)
                for (Edge<T> currentEdge = current.firstEdge; currentEdge != null; currentEdge = currentEdge.nextEdge)
                    list.add(currentEdge.toVertex.vertexInfo);
        return list;
    }

    public void printEdges() {
        for (Vertex<T> current = head; current != null; current = current.nextVertex) {
            System.out.printf("%s : ", current.vertexInfo);
            for(Edge<T> currentEdge = current.firstEdge; currentEdge != null; currentEdge = currentEdge.nextEdge)
                System.out.printf("[%s,%s] ", current.vertexInfo, currentEdge.toVertex.vertexInfo);
            System.out.println();
        }
    }
}

class Vertex<T extends Comparable<T>> {
    T vertexInfo;
    int indeg;
    int outdeg;
    Vertex<T> nextVertex;
    Edge<T> firstEdge;

    public Vertex() {
        this(null, null);
    }

    public Vertex(T vInfo, Vertex<T> next) {
        vertexInfo = vInfo;
        indeg = 0;
        outdeg = 0;
        nextVertex = next;
        firstEdge = null;
    }
}

class Edge<T extends Comparable<T>> {
    Vertex<T> toVertex;
    Edge<T> nextEdge;

    public Edge() {
        this(null, null);
    }

    public Edge(Vertex<T> destination, Edge<T> a) {
        toVertex = destination;
        nextEdge = a;
    }
}