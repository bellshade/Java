package algorithm.datastructure.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * seluruh file kelas ini digunakan untuk membangun
 * struktur data Binary Tree. ada kelas node dan kelas
 * pohon, keduanya akan dijelaskan tiap komentar
 */
public class BinaryTree {
    /**
     * kelas ini mengimplementasikan node yang akan
     * mengarah ke binary tree. mereka terdiri dari data
     * di dalamnya, node ke kiri, node ke kanan, dan
     * parent dari mana sumber node berasal
     */
    static class Node {
        // data untuk node
        public int data;
        // node di sebelah kiri
        public Node kiri;
        // node di sebelah kanan
        public Node kanan;
        // parent dari node ini
        public Node parent;

        /**
         * konstruktor of node
         *
         * @param nilai untuk dimasukkan ke dalam node
         */
        public Node(int value) {
            data = value;
            kiri = null;
            kanan = null;
            parent = null;
        }
    }

    // root dari binary tree
    private Node root;

    // konstruktor
    public BinaryTree() { root = null; }

    // parameter kontruktor
    public BinaryTree(Node root) { this.root = root; }

    /**
     * metode untuk menentukan node dengan nilai tertentu
     *
     * @param key nilai yang sedang dicari
     */
    public Node cari(int key) {
        Node sekarang = root;
        while (sekarang != null) {
            if (key < sekarang.data) {
                if (sekarang.kiri == null) {
                    return sekarang;
                }
                sekarang = sekarang.kiri;
            } else if (key > sekarang.data) {
                if (sekarang.kanan == null) {
                    return sekarang;
                }
                sekarang = sekarang.kanan;
            } else {
                return sekarang;
            }
        }
        return null;
    }

    /**
     * memasukkan nilai tertentu ke dalam pohon biner
     *
     * @param value value yang akan dimasukkan
     */
    public void put(int value) {
        Node nodeBaru = new Node(value);
        if (root == null) {
            root = nodeBaru;
        } else {
            /**
             * ini akan mengembalikan segera menjadi induk
             * dari nilai yang dimasukkan
             */
            Node parent = cari(value);

            if (value < parent.data) {
                parent.kiri = nodeBaru;
                parent.kanan.parent = parent;
                return;
            } else {
                parent.kanan = nodeBaru;
                parent.kanan.parent = parent;
                return;
            }
        }
    }

    /**
     * menghapus nilai tertentu dari
     * binary tree
     *
     * @param value value untuk dihapus *
     */
    public boolean remove(int value) {
        Node temp = cari(value);

        // jika value yang dicari tidak ada
        if (temp.data != value) {
            return false;
        }

        if (temp.kanan == null && temp.kiri == null) {
            if (temp == root) {
                root = null;
            } else if (temp.parent.data < temp.data) {
                temp.parent.kanan = null;
            } else {
                temp.parent.kiri = null;
            }
            return true;
        } else if (temp.kiri != null && temp.kanan != null) {
            Node sucessor = cariSuccessor(temp);

            // pohon temp yang kiri dijadikan penerus node kiri
            sucessor.kiri = temp.kiri;
            sucessor.kiri.parent = sucessor;

            // jika successor memiliki child node, maka
            // sucessor utama adadalah parent utama
            if (sucessor.parent != temp) {
                if (sucessor.kanan != temp) {
                    sucessor.kanan.parent = sucessor.parent;
                    sucessor.kanan.parent = sucessor.kanan;
                    sucessor.kanan = temp.kanan;
                    sucessor.kanan.parent = sucessor;
                } else {
                    sucessor.parent.kiri = null;
                    sucessor.kanan = temp.kanan;
                    sucessor.kanan.parent = sucessor;
                }
            }
            if (temp == root) {
                sucessor.parent = null;
                root = sucessor;
                return true;
            } else {
                // jika tidak mendelete root node
                sucessor.parent = temp.parent;
                if (temp.parent.data < temp.data) {
                    temp.parent.kanan = sucessor;
                } else {
                    temp.parent.kiri = sucessor;
                }
                return true;
            }
        } else {
            // jika memeiliki node child pada sebelah kanan
            if (temp.kanan != null) {
                if (temp == root) {
                    root = temp.kanan;
                    return true;
                }
                temp.kanan.parent = temp.parent;

                // definisikan temp ke kiri atau ke child yang kanan
                if (temp.data < temp.parent.data) {
                    temp.parent.kiri = temp.kanan;
                } else {
                    temp.parent.kanan = temp.kanan;
                }
                return true;
            } else {
                // jika tedapat child node di bagian kiri
                if (temp == root) {
                    root = temp.kiri;
                    return true;
                }
                temp.kiri.parent = temp.parent;

                // definisikan temp ke kiri atau ke kanan
                if (temp.data < temp.parent.data) {
                    temp.parent.kiri = temp.kiri;
                } else {
                    temp.parent.kanan = temp.kiri;
                }
                return true;
            }
        }
    }

    /**
     * metode ini menemukan penerus node yang diberikan
     * bergerak ke kanan
     * meninggalkan pohon sejauh yang bisa
     */
    public Node cariSuccessor(Node n) {
        if (n.kanan == null) {
            return n;
        }
        Node sekarang = n.kanan;
        Node parent = n.kanan;
        while (sekarang != null) {
            parent = sekarang;
            sekarang = sekarang.kiri;
        }
        return parent;
    }

    /*
     * menegembalikan nilai dari root binary tree
     */
    public Node dapatkanRoot() { return root; }

    /**
     * menampilkan child kiri kemudian root lalu child kiri
     *
     * @param localroot local root darii Binary tree
     */
    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.kiri);
            System.out.print(localRoot.data + " ");
        }
    }

    /**
     * menampilkan aroot kemudian child kiri lalu child kiri
     */

    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.data + " ");
            preOrder(localRoot.kiri);
            preOrder(localRoot.kanan);
        }
    }

    /**
     * dengan menggunaakan algoritma searching yang bernama bfs(breadth first
     * search)
     * algoritma ini mirip dengan pre-order traversal, tetapi alih alih ini
     * di implementasikan dengan stack atau rekursif, atau diimplementasikan
     * dengan antrian atau queue
     */
    public void bfs(Node localRoot) {
        // membuat queue
        Queue<Node> queue = new LinkedList<Node>();

        // jika root yang diberikan adalah null, maka kita tidak
        // akann menambahkan ke dalam queue
        if (localRoot != null) {
            queue.add(localRoot);
        }

        // lanjutkan ketika queue menjadi kosong
        while (!queue.isEmpty()) {
            localRoot = queue.remove();
            System.out.print(localRoot.data + " ");
        }
        if (localRoot.kanan != null) {
            queue.add(localRoot.kanan);
        }
        if (localRoot.kiri != null) {
            queue.add(localRoot.kiri);
        }
    }
}
