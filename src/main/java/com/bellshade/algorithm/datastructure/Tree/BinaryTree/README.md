# binary tree

binary tree atau pohon biner berarti bahwa simpul data memiliki maksimal 2 child, disini, nama biner itu sendiri menjukkan bahwa 'dua'; oleh karena itu, setiap node dapat memiliki ``0``, ``1``.

## sifat pohon biner

- pada setiap level i, jumlah node maksimum adalah 2
- ketinggian pohon didefinisikan sebagi jalur terpanjang dari simpul akare ke simpul daun. pohon yang ditunjukkan di atas memiliki tinggi sama dengan 3. oleh karena itu, jumlah maksimum noe pada ketinggian 3 sama dengan ``(1 + 2 + 3 + 4) = 15``.
- jumlah minimum node yang mungkin pada ketinggian h sama dengan ``h+1``
- jika jumlah node minimum, maka tinggi pohon akan makimum. Sebaliknya, jika jumlah node maksimum, maka tinggi pohon akan minimum.

## jenis dari pohon biner

ada 4 jenis pohon biner antara lain
- complete binary tree
- perfect binary tree
- degenerate binary tree
- balanced binary tree

## contoh sederhana dari pohon biner

```java
// membuat node pohon
class Node {
    int kunci;
    Node kiri, kanan;

    public Node(int item) {
        kunci = item;
        kiri = kanan = null;

    }
}

// membuat kelas binary tree
class BinaryTree {
    // membuat root binary tree
    Node root;
    
    // traverse pohon
    public void traverseTree(Node node) {
        if (node != null) {
            traverseTree(node.kiri);
            System.out.print(" " + node.kunci);
            traverseTree(node.kanan);
        }
    }

    public static void Main(String[] args) {
        // membuat object dari binary tree
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.kiri = new Node(2);
        tree.root.kanan = new Node(3);
        tree.root.kiri.kiri = new Node(4);
        
        System.out.print("\nBinaryTree: ");
        tree.traverseTree(tree.root);
    }
}
```
