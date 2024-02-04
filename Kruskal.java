import java.util.*;

public class Kruskal {

    class Edge implements Comparable<Edge> {
        int src, dest, weight;

        public int compareTo(Edge compareEdge) {
            return this.weight - compareEdge.weight;
        }
    }

    private int V, E;
    private Edge[] edges;

    public Kruskal(int v, int e) {
        V = v;
        E = e;
        edges = new Edge[E];
        for (int i = 0; i < e; i++) {
            edges[i] = new Edge();
        }
    }

    private int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    private void union(int[] parent, int x, int y) {
        int xSet = find(parent, x);
        int ySet = find(parent, y);
        parent[xSet] = ySet;
    }

    public void kruskal() {
        Edge[] result = new Edge[V - 1];
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        Arrays.sort(edges);

        int i = 0, e = 0;

        while (e < V - 1) {
            Edge nextEdge = edges[i++];
            int x = find(parent, nextEdge.src);
            int y = find(parent, nextEdge.dest);

            if (x != y) {
                result[e++] = nextEdge;
                union(parent, x, y);
            }
        }

        printMST(result);
    }

    private void printMST(Edge[] result) {
        System.out.println("Kruskal Algoritması Çözümü (Minimum Spanning Tree):");
        for (Edge edge : result) {
            System.out.println("Kenar: " + edge.src + " - " + edge.dest + " | Ağırlık: " + edge.weight);
        }
    }

    public static void main(String[] args) {
        int V = 4;
        int E = 5;

        Kruskal kruskalGraph = new Kruskal(V, E);


        kruskalGraph.edges[0].src = 0;
        kruskalGraph.edges[0].dest = 1;
        kruskalGraph.edges[0].weight = 10;

        kruskalGraph.edges[1].src = 0;
        kruskalGraph.edges[1].dest = 2;
        kruskalGraph.edges[1].weight = 6;

        kruskalGraph.edges[2].src = 0;
        kruskalGraph.edges[2].dest = 3;
        kruskalGraph.edges[2].weight = 5;

        kruskalGraph.edges[3].src = 1;
        kruskalGraph.edges[3].dest = 3;
        kruskalGraph.edges[3].weight = 15;

        kruskalGraph.edges[4].src = 2;
        kruskalGraph.edges[4].dest = 3;
        kruskalGraph.edges[4].weight = 4;

        kruskalGraph.kruskal();
    }
}
