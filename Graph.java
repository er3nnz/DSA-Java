import java.util.ArrayList;
import java.util.List;

public class Graph {

    private int V; // Düğüm sayısı
    private List<List<Integer>> adjList; // Komşuluk listesi

    public Graph(int V) {
        this.V = V;
        this.adjList = new ArrayList<>(V);

        for (int i = 0; i < V; i++) {
            this.adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        // Yönlü graf için
        adjList.get(src).add(dest);

        // Eğer graf yönsüz ise aşağıdaki satır da eklenebilir
        // adjList.get(dest).add(src);
    }

    public void printGraph() {
        System.out.println("Grafın Komşuluk Listesi:");

        for (int i = 0; i < V; i++) {
            System.out.print("Düğüm " + i + " -> ");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5; // Örnek olarak, 5 düğümlü bir graf

        Graph graph = new Graph(V);

        // Kenarları tanımla
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
