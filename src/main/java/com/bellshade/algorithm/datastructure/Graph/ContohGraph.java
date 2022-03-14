package com.bellshade.algorithm.datastructure.Graph;

import java.util.*;

class Edge {
    // kelas untuk menyimpan tei dari graf berbobot
    int src, dest, weight;
    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

}

class Graph {
    // kelas graph
    // simpul dari daftar kedekatan
    static class Node {
        int value, weight;
        Node(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
    };

    // tentukan daftar kedekatan
    List<List<Node>> adj_list = new ArrayList<>();

    // konstruktor dari graph
    public Graph(List<Edge> edges) {
        // aloksi memori daftar kedekatan
        for (int i = 0; i < edges.size(); i++)
            adj_list.add(i, new ArrayList<>());
        
        // tambahkan tepi ke graf
        for (Edge e : edges) {
            // alokasikan simpul baru ke dalam daftar kedekatan
            // dari sumber ke tujuan
            adj_list.get(e.src).add(new Node(e.dest, e.weight));
        }
    }

    // cetak daftar ketentanggaan untuk grafik
    public static void printGraph(Graph graph) {
        int src_vertex = 0;
        int list_size = graph.adj_list.size();

        System.out.println("konten dari graph");
        while (src_vertex < list_size) {
            // melintasi daftar kedekata dan mencetak tepinya
            for (Node edge : graph.adj_list.get(src_vertex)) {
                System.out.println("vertex" + src_vertex + "==> " + edge.value + " (" + edge.weight + ")\t");
            }
            System.out.println();
            src_vertex++;
        }
    }
}

public class ContohGraph {
    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(new Edge(0, 1, 2), new Edge(0, 2, 4),
                new Edge(1, 2, 4), new Edge(2, 0, 5), new Edge(2, 1, 4),
                new Edge(3, 2, 3), new Edge(4, 5, 1), new Edge(5, 4, 3));
        
        // panggil kelas konstruktor graf untuk membuat graf
        Graph graph = new Graph(edges);

        // cetak grafik sebagai daftar kedekatan
        Graph.printGraph(graph);
    }
}
