package bellshade.algorithm.datastructure.Tree.BinaryTree;

/**
 * membuat fungsi dari delete node
 */

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNode {
    static class Node {
        int kunci;
        Node kiri, kanan;

        // membuat konstruktor
        Node (int kunci) {
            this.kunci = kunci;
            kiri = null;
            kanan = null;
        }
    }

    static Node root;
    static Node temp = root;

    // inorder traversal dari binary tree

    static void inorder(Node temp) {
        if (temp == null) {
            return;
        }
        inorder(temp.kiri);
        System.out.print(temp.kunci + " ");
        inorder(temp.kanan);
    }
    
    static void deleteNode(Node root, Node delNode) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null;

        // cek jika kosong
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp == delNode) {
                temp = null;
                return;
            }
            if (temp.kanan != null) {
                if (temp.kanan == delNode) {
                    temp.kanan = null;
                    return;
                }
                else {
                    q.add(temp.kanan);
                }
            }
            if (temp.kiri != null) {
                if (temp.kiri == delNode) {
                    temp.kiri = null;
                    return;
                }
                else {
                    q.add(temp.kiri);
                }
            }
        }
    }

    static void delete(Node root, int kunci) {
        if (root == null)
            return;
        
        if (root.kiri == null && root.kanan == null) {
            if (root.kunci == kunci) {
                root = null;
                return;
            }
            else 
                return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        Node temp = null, keyNode = null;

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.kunci == kunci)
                keyNode = temp;
            if (temp.kiri != null)
                q.add(temp.kiri);
            if (temp.kanan != null)
                q.add(temp.kanan);
        }
        if (keyNode != null) {
            int x = temp.kunci;
            deleteNode(root, temp);
            keyNode.kunci = x;
        }

    }

    public static void main(String[] args) {
        root = new Node(10);
        root.kiri = new Node(5);
        root.kiri.kiri = new Node(7);
        root.kiri.kanan = new Node(12);
        root.kanan = new Node(9);
        root.kanan.kiri = new Node(15);
        root.kanan.kanan = new Node(8);
        
        System.out.println("inorder traversal sebelum dihapus");
        inorder(root);
        int kunci = 7;
        delete(root, kunci);
        System.out.println("\ninorder traversal setelah dihapus");
        inorder(root);

    }
    
}
