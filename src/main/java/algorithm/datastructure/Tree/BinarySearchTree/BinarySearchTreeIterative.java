package algorithm.datastructure.Tree.BinarySearchTree;

/**
 * binary search tree adalah pohon biner yang memenuhi tiga
 * properti: child kiri kurang dari node akar, child kanan lebih
 * besar dari node akar, child kiri dan kanan sendiri harus  menjadi
 * dari BST
 */
import java.util.Stack;

public class BinarySearchTreeIterative {
  // referensi untuk simpul dari BST
  private Node root;

  BinarySearchTreeIterative() {
    root = null;
  }

  public static void main(String[] args) {
    
  }

  /**
    * metode untuk menyisipkan nilai baru pada BST
    * jika nilai yang diberikan sudah ada di BST
    * maka penyisipan akan diabaikan
    */

  public void add(int data) {
    Node parent = null;
    Node temp = this.root;
    int rightOrLeft = -1;
    /*
     * mencari tempat yang tepat untuk simpul 
     * ditempatkan sesuai aturan dari BST
     */
    while (temp != null) {
      if (temp.data > data) {
        parent = temp;
        temp = parent.left;
        rightOrLeft = 0;
      } else if (temp.data < data) {
        parent = temp;
        temp = parent.right;
        rightOrLeft = 1;
      } else {
        System.out.println(data + " sudah ada pada BST");
        return;
      }
    }
    /**
     * membuat node baru dengan lai yang diteruskan karena
     * data node belum ada
     */
    Node newNode = new Node(data);
    /**
     * jika simpul induk 0
     * maka penyisipan dilakukan di root sendiri
     */
    if (parent == null) {
      this.root = newNode;
    } else {
      /**
       * memeriksa apakah penyisipan akan di lakukan pada
       * sub pohon kiri atau kanan
       */
      if (rightOrLeft == 0) {
        parent.left = newNode;
      } else {
        parent.right = newNode;
      }
    }
  }

  // metode untuk menghapus node di bst jika ada simpul
  // maka akan dihapus
  public void remove(int data) {
    Node parent = null;
    Node temp = this.root;
    int rightOrLeft = -1;
    /**
     * temukan induk dari simpul dan simpul itu sendiri yang
     * akan dihapus. variabel induk menyimpan simpul induk temp
     * yang akan disimpan. rightOrLeft digunakan untuk melacak child
     * kiri atau kanan dari subpohon BST
     */
    while (temp != null) {
      if (temp.data == data) {
        break;
      } else if (temp.data > data) {
        parent = temp;
        temp = parent.left;
        rightOrLeft = 0;
      } else {
        parent = temp;
        temp = parent.right;
        rightOrLeft = 1;
      }
    }
    
    if (temp != null) {
      Node replacement;
      if (temp.right == null && temp.left == null) {
        replacement = null;
      } else if (temp.right == null) {
        replacement = temp.left;
        temp.left = null;
      } else if (temp.left == null) {
        replacement = temp.right;
        temp.right = null;
      } else {
        /**
         * jika keuda chil kiri dan kanan ada
         * maka kitaakan mengganti data node ini dengan data
         * simpul paling kiri di sub pohon kanannya untuk menjaga
         * keseimbangan dari BST dan kemudian menghapus nodenya.
         */
        if (temp.right.left == null) {
          temp.data = temp.right.data;
          replacement = temp;
          temp.right = temp.right.right;
        } else {
          Node parent2 = temp.right;
          Node child = temp.right.left;
          while (child.left != null) {
            parent2 = child;
            child = parent2.left;
          }
          temp.data = child.data;
          parent2.left = child.right;
          replacement = temp;
        }
      }

      if (parent == null) {
        this.root = replacement;
      } else {
        if (rightOrLeft == 0) {
          parent.left = replacement;
        } else {
          parent.right = replacement;
        }
      }
    }
  }

  // metode inorder traversal dari BST
  public void inorder() {
    if (this.root == null) {
      System.out.println("BST kosong");
      return;
    }
    System.out.println("Inorder traversal dari tree adalah:");
    Stack<Node> st = new Stack<Node>();
    Node cur = this.root;
    while (cur != null || !st.empty()) {
      while (cur != null) {
        st.push(cur);
        cur = cur.left;
      }
      cur = st.pop();
      System.out.print(cur.data + " ");
      cur = cur.right;

    }
    System.out.println();
  }

  // metode postorder traversal dari BST
  public void postorder() {
    if (this.root == null) {
      System.out.println("BST ini empty");
      return;
    }
    System.out.println("postorder traversal dari tree adalah:");
    Stack<Node> st = new Stack<Node>();
    Node cur = this.root, temp2;
    while (cur != null || !st.empty()) {
      if (cur != null) {
        st.push(cur);
        cur = cur.left;
      } else {
        temp2 = st.peek();
        if (temp2.right != null) {
          cur = temp2.right;
        } else {
          st.pop();
          while (!st.empty() && st.peek().right == temp2) {
            System.out.print(temp2.data + " ");
            temp2 = st.pop();
          }
          System.out.print(temp2.data + " ");
        }
      }
    }
    System.out.println();
  }

  /**
   * metode untuk cek jika data sudah tersedia dalam BST
   * @param data dari value yang ingin dicari
   * @return bool jika value yang dicari telah ditemukan
   */
  public boolean find(int data) {
    Node temp = this.root;
    // cek jika node sudah ada
    while (temp != null) {
      if (temp.data > data) {
        temp = temp.left;
      } else if (temp.data < data) {
        temp = temp.right;
      } else {
        // jika ketemu mengambalikan
        // true
        System.out.println(data + " sudah ada dalam bst");
        return true;
      }
    }
    System.out.println(data + " tidak ditemukan");
    return false;
  }

  // membuat kelas untuk membangun pohon BST
  private static class Node {
    int data;
    Node left;
    Node right;

    Node(int d) {
      data = d;
      left = null;
      right = null;
    }
  }
}
