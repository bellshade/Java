package com.bellshade.algorithm.datastructure.Tree.BinaryTree;

public class BinaryTreeInsert {
    public static void main(String[] args) {
        new BinaryTreeInsert().run();
    }

    // membuat pohon node
    static class Node {
        Node kiri;
        Node kanan;
        int value;
        
        public Node(int value) {
            this.value = value;
        }
    }

    // membuat fungsi untuk menjalankan binary tree insert
    public void run() {
        Node rootNode = new Node(25);
        System.out.println("membuat pohon dengan value root " + rootNode.value);
        insert(rootNode, 11);
        insert(rootNode, 15);
        insert(rootNode, 16);
        insert(rootNode, 23);
        insert(rootNode, 79);
    }

    // membuat fungsi untuk menambahkan node baru
    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.kiri != null) {
                insert(node.kiri, value);
            }
            else {
                System.out.println(" menambah " + value + "ke kiri dari node " + node.value);
                node.kiri = new Node(value);
            }
        }
        else if (value > node.value) {
            if (node.kanan != null) {
                insert(node.kanan, value);
            }
            else {
                System.out.println(" menambah " + value + "ke kanan dari node " + node.value);
                node.kanan = new Node(value);
            }
        }
    }
}
