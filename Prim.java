import java.util.*;

public class Prim {

    private int V;
    private List<List<Node>> adjList;

    static class Node {
        int dest, weight;

        Node(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }

    public Prim(int V) {
        this.V = V;
        this.adjList = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            this.adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        Node newNode = new Node(dest, weight);
        adjList.get(src).add(newNode);

        newNode = new Node(src, weight);
        adjList.get(dest).add(newNode);
    }

    public void prim() {
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        boolean[] visited = new boolean[V];
        List<Node> mst = new ArrayList<>();

        visited[0] = true;
        priorityQueue.addAll(adjList.get(0));

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();

            if (!visited[currentNode.dest]) {
                visited[currentNode.dest] = true;
                mst.add(currentNode);

                priorityQueue.addAll(adjList.get(currentNode.dest));
            }
        }

        printMST(mst);
    }

    private void printMST(List<Node> mst) {
        System.out.println("Prim Algoritması Çözümü (Minimum Spanning Tree):");
        for (Node node : mst) {
            System.out.println("Kenar: " + node.dest + " - Ağırlık: " + node.weight);
        }
    }

    public static void main(String[] args) {
        int V = 5;

        Prim primGraph = new Prim(V);

        primGraph.addEdge(0, 1, 2);
        primGraph.addEdge(0, 3, 6);
        primGraph.addEdge(1, 2, 3);
        primGraph.addEdge(1, 3, 8);
        primGraph.addEdge(1, 4, 5);
        primGraph.addEdge(2, 4, 7);
        primGraph.addEdge(3, 4, 9);

        primGraph.prim();
    }
}
