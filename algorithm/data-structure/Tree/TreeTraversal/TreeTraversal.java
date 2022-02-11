/**
 * source code contoh dari pemanfaatan tree traversal
 * inorder, preorder, postorder
 */

// membuat pohon node
public class Node {
    int kunci;
    Node kiri, kanan;

    public Node(int item) {
        kunci = item;
        kiri = kanan = null;
    }
}

// kelas utama dari file tree traversal
public class TreeTraversal {
    // root dari binary tree
    Node root;

    TreeTraversal() { root = null; }
    
    void printPostOrder(Node node) {
        if (node == null) {
            return;
        }

        // pertama berulang di sub tree kiri
        printPostOrder(node.kiri);

        // kedua berulang di sub tree kanan
        printPostOrder(node.kanan);

        // ketiga print node
        System.out.println(node.kunci + " ");
    }

    void printInorder(Node node) {
        if (node == null) {
            return;
        }

        // pertama berulang di sub tree kiri
        printInorder(node.kiri);

        // kedua print node
        System.out.println(node.kunci + " ");
    }

    void printPreorder(Node node) {
        if (node == null) {
            return;
        }

        // pertama print node
        System.out.println(node.kunci + " ");

        // kedua berulang di sub tree kiri
        printPreorder(node.kiri);

        // ketiga berulang di sub tree kanan
        printPreorder(node.kanan);
    }

    // memuat fungsi dari tree traversal secara rekursif
    void printPostOrder() { printPostOrder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }

    // menjalankan fungsi dari tree traversal
    public static void main(String[] args) {
        // membuat tree traversal
        TreeTraversal pohon = new TreeTraversal();

        // membuat node
        pohon.root = new Node(1);
        pohon.root.kiri = new Node(2);
        pohon.root.kanan = new Node(3);
        pohon.root.kiri.kiri = new Node(4);
        pohon.root.kiri.kanan = new Node(5);

        // menjalankan fungsi dari tree traversal
        System.out.println("preorder traversal dari binary tree adalah ");
        pohon.PrintPreorder();

        System.out.println("\nInorder traversal dari binary tree adalah ");
        pohon.printInorder();

        System.out.println("\nPostOrder traversal dari binary tree adalah")
        pohon.printPostOrder();
    }
}