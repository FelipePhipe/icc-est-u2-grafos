import Controllers.Graph;
import Models.Node;

public class App {
    public static void main(String[] args) {
        Graph g = new Graph();
        System.out.println("Felipe Parra");

        Node v0 = g.addNode(0);
        Node v1 = g.addNode(1);
        Node v2 = g.addNode(2);
        Node v3 = g.addNode(3);
        Node v4 = g.addNode(4);
        Node v5 = g.addNode(5);
        Node v7 = g.addNode(7);
        Node v8 = g.addNode(8);
        Node v9 = g.addNode(9);

        // Conexiones para el grafo
        g.addEdge(v0, v1);
        g.addEdge(v0, v3);
        g.addEdge(v0, v5);

        g.addEdge(v1, v2);
        g.addEdge(v1, v4);
        g.addEdge(v1, v8);

        g.addEdge(v2, v3);

        g.addEdge(v3, v4);
        g.addEdge(v3, v7);
        g.addEdge(v3, v9);  

        g.addEdge(v7, v8);

        g.printGraph();
    }
}
