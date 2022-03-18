# tree tranversal

tidak seperti struktur data linier, yang hanya memiliki satu cara logis untuk melintasinya, tree dapat dilintasi dengan cara yang berbeda.. berikut ini adalah cara yang umum digunakan untuk melintasi tree.

![tree](tree12.gif)

- inorder (kiri, root, kanan) = 4 2 5 1 3
- preorder (root, kiri, kanan) = 1 2 4 5 3
- postorder (kiri, kanan, root) = 4 5 2 3 1

## penggunaan inorder
dalam kasus pohon pencarian biner. traversal inorder memberikan node dalam urutan yang tidak menurut. untuk mendapatkan ndoe BST dalam urutan yang tidak meningkat, variasu traverseal inorder di mana traversal inorder terbalik dapat digunakan

## penggunaan preorder

preorder traversal digunakan untik membuat salinan pohon. traversal preorder juga digunkakan untuk mendapatkan ekspresi awalan pada pohon ekspresi. 

algoritma pada postorder
1. lintasi subpohon kiri, yaitu panggil postorder (subpohon kiri)
2. lintasi subpohon kanan, yaitu panggil postorder (subpohon kanan)
3. mengunjungi root.

## penggunaan postorder

postorder traversal digunakan untuk menghapus pohon. traverasl postorder juga berguna untuk mendapatkan ekspresi postfix dari pohon eskpresi.


## contoh postororder traversal

```java
public class Node {
    int kunci;
    Node kiri, kanan;

    public Node(int item) {
        kunci = item;
        kiri = kanan = null;
    }
}

class BinaryTree {
    Node root;
    
    void printPostOrder(Node node) {
        if (node == null) {
            return;
        }

        printPostOrder(node.kiri);
        printPostOrder(node.kanan);
        System.out.println(node.kunci + " ");
    }

    void printInorder(Node node) {
        if (node == null) {
            return;
        }

        printInorder(node.kiri);
        System.out.println(node.kunci + " ");
    }

    void printPreorder(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.kunci + " ");
        printPreorder(node.kiri);
        printPreorder(node.kanan);
    }

    void printPostOrder() { printPostOrder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }

    public static void main(String[] args) {
        BinaryTree pohon = ne BinaryTree();

        pohon.root = new Node(1);
        pohon.root.kiri = new Node(2);
        pohon.root.kanan = new Node(3);
        pohon.root.kiri.kiri = new Node(4);
        pohon.root.kiri.kanan = new Node(5);

        System.out.println("preorder traversal dari binary tree adalah ");
        pohon.PrintPreorder();

        System.out.println("\nInorder traversal dari binary tree adalah ");
        pohon.printInorder();

        System.out.println("\nPostOrder traversal dari binary tree adalah")
        pohon.printPostOrder();
    }
}
```