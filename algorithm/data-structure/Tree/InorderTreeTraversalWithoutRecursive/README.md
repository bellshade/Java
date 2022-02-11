# traversal pohon inorder tanpa rekursif

menggunakan stack adalah cara yang jelas untuk melintasi pohon tanpa rekursif. berikut kita menggunakan algoritma untuk melintasi pohon biner menggunakan stack

1. buat tumpukan kosong N
2. inisialisasi simpul saat ini sebagai root
3. dorong simpul saat ini ke  N dan atur arus = arus -> kiri hingga arus ``NULL``
4.  jika arus ``NULL`` dan tumpukkan tidak kosong maka
    1. pop item teratas dari tumpukan
    2. cetak item yang muncul.
    3. lanjut ke langkah nomor 3
5. jika arus ``NULL`` dan tumpukkan kosong maka selesai.

```java
import java.util.Stack;

// membuat node dari pohon

public class Node {
    int data;
    Node kiri, kanan;

    public Node(int item) {
        data = item;
        kiri = kanan = null;
    }
}

public class TreeTraversalWithoutRecursive {
    Node root;

    void inorder() {
        if (root == null)
            return;
        
        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // traverse pohon biner
        while (cur != null || s.sisze() > 0 ) {
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
        TreeTraversalWithoutRecursive pohon = ne TreeTraversalWithoutRecursive();

        pohon.root = new Node(1);
        pohon.root.kiri = new Node(2);
        pohon.root.kanan = new Node(3);
        pohon.root.kiri.kiri = new Node(4);
        pohon.root.kiri.kanan = new Node(5);
        pohon.inorder();
    }
}
