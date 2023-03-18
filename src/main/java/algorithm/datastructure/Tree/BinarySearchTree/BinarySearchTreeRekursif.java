package algorithm.datastructure.Tree.BinarySearchTree;

/**
 * implementasi binary search tree secara rekursif.
 */
public class BinarySearchTreeRekursif {
  private Node root;
  /**
   * konstruktor untuk mengubah value dari Node
   * menjadi nul
   */
  BinarySearchTreeRekursif() {
    root = null;
  }
  
  /**
   * class node digunakan untuk membangun binary search tree
   */
  private static class Node {
    int data;
    Node kiri;
    Node kanan;

    Node(int d){
      data = d;
      kiri = null;
      kanan = null;
    }
  }

  /**
   * fungsi ini untuk memasukkan ke dalam binary search tree
   * @param node untuk mengecek apakah data bisa dimasukkan dalam subpohon
   * @param data data untuk dimasukkan
   */
  private Node insert(Node node, int data) {
    if (node == null) {
      node = new Node(data);
    } else if (node.data > data) {
      node.kiri = insert(node.kiri, data);
    } else if (node.data < data) {
      node.kanan = insert(node.kanan, data);
    }
    return node;
  }

  /**
   * fungsi ini untuk menghapus data jika data sudah terdapat pada pohon
   * @param node node yang ditampilkan yang dicari untuk dihapus
   * @param data data yang akan dihapus
   */
  private Node hapus(Node node, int data) {
    if (node == null) {
      System.out.println("tidak ada data tersedia di pohon");
    } else if (node.data > data) {
      node.kiri = hapus(node.kiri, data);
    } else if (node.data < data) {
      node.kanan = hapus(node.kanan, data);
    } else {
      if (node.kanan == null && node.kiri == null) {
        node = null;
      } else if (node.kiri == null) {
        Node temp = node.kanan;
        node.kanan = null;
        node = temp;
      } else if (node.kanan == null) {
        Node temp = node.kiri;
        node.kiri = null;
        node = temp;
      } else {
        Node temp = node.kanan;
        while (temp.kiri != null) {
          temp = temp.kiri;
        }
        node.data = temp.data;
        node.kanan = hapus(node.kanan, temp.data);
      }
    }
    return node;
  }

  /**
   * cari secara rekursif jika nilai yang diberikan ada
   * di pohon atau tidak
   */
  
  private boolean cari(Node node, int data) {
    if (node == null) {
      return false;
    } else if (node.data == data) {
      return true;
    } else if (node.data > data) {
      return cari(node.kiri, data);
    } else {
      return cari(node.kanan, data);
    }
  }

  public void tambah(int data) {
    this.root = insert(this.root, data);
  }

  public void remove(int data) {
    this.root = hapus(this.root, data);
  }

  public boolean mencari(int data) {
    if (cari(this.root, data)) {
      System.out.println(data + " terdapat pada pohon");
      return true;
    }
    System.out.println(data + " tidak terdapat pada pohon");
    return false;
  }

  public static void main(String[] args) {
    BinarySearchTreeRekursif pohon = new BinarySearchTreeRekursif();
    pohon.tambah(5);
    pohon.tambah(10);
    pohon.tambah(9);
    assert !pohon.mencari(4) : "4 tidak terdapat dalam pohon";
    assert pohon.mencari(10) : "10 terdapat pada pohon";
    pohon.remove(9);
  }
}
