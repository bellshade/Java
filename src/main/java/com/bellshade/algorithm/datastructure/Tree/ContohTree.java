package com.bellshade.algorithm.datastructure.Tree;

class Node {
    int kunci;
    Node kiri, kanan;

    public Node(int item) {
        kunci = item;
        kiri = kanan = null;
    }
}

public class ContohTree {
    Node root;

    ContohTree(int kunci) {
        root = new Node(kunci);
    }
    
    ContohTree() {
        root = null;
    }

    public static void main(String[] args) {
        ContohTree tree = new ContohTree();
        tree.root = new Node(1);

        /**
         *   1
            /   \
          null  null
         */

        tree.root.kiri = new Node(2);
        tree.root.kanan = new Node(3);

        /**
         *     1
            /     \
          2        3
        /   \     /  \
      null null null null
         */

        tree.root.kiri.kiri = new Node(4);

        /**
         *         1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
    }
}
