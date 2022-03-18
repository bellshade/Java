package algorithm.datastructure.Tree.TraversalTreeWithoutRecursive;

import java.util.Stack;

// membuat node dari pohon

class Node {
    int data;
    Node kiri, kanan;

    public Node(int item) {
        data = item;
        kiri = kanan = null;
    }
}

public class InorderTreeTraversalWithoutRecursive {
    Node root;

    void inorder() {
        if (root == null)
            return;
        
        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // traverse pohon biner
        while (curr != null || s.size() > 0 ) {
            // capai node paling kiri dari node saat ini
            while (curr != null) {
                s.push(curr);
                curr = curr.kiri;
            }
        }

        // saat ini variabel curr harus NULL
        curr = s.pop();

        System.out.println(curr.data + " ");

        // kita telah mengunjungi node dan subtree kiri
        // sekarang kita lanjut ke subree kanan
        curr = curr.kanan;
    }

    public static void main(String[] args) {
        InorderTreeTraversalWithoutRecursive pohon = new InorderTreeTraversalWithoutRecursive();

        pohon.root = new Node(1);
        pohon.root.kiri = new Node(2);
        pohon.root.kanan = new Node(3);
        pohon.root.kiri.kiri = new Node(4);
        pohon.root.kiri.kanan = new Node(5);
        pohon.inorder();
    }
}