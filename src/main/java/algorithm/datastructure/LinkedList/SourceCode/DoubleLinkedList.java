package algorithm.datastructure.LinkedList.SourceCode;

public class DoubleLinkedList {
  protected Link head;
  private Link tail;
  private LinkOperation linkOperations;
  private int ukuran;

  public DoubleLinkedList() {
    head = null;
    tail = null;
    ukuran = 0;
  }

  // buat list dengan mengandung element dari array
  public DoubleLinkedList(int[] array) {
    if (array == null) {
      throw new NullPointerException();
    }
    for (int i : array) {
      linkOperations.insertTail(i, this);
    }
    ukuran = array.length;
  }

  // mengembalikaan true jika list kosong
  public boolean isEmpty() {
    return (head == null);
  }

  // print element dalam list
  public void display() {
    Link current = head;
    while (current != null) {
      current.displayLink();
      current = current.next;
    }
    System.out.println();
  }

  // tampilkan element dalam list dalam perintah reverse
  public void displayBackward() {
    Link current = tail;
    while (current != null) {
      current.displayLink();
      current = current.previous;
    }
    System.out.println();
  }
}

// kelas link digunakan untuk implementasi node dalam linked list
class Link {
  public int value;
  public Link next;
  public Link previous;

  // constructor
  public Link(int value) {
    this.value = value;
  }

  // tampilkan dari node
  public void displayLink() {
    System.out.println(value + " ");
  }

  public static void main(String args[]) {
    DoubleLinkedList listSaya = new DoubleLinkedList();
    LinkOperation linkOperations = new LinkOperation();
    linkOperations.insertTail(13, listSaya);
  }
}

// kelas untuk implementasi dari link nodes
class LinkOperation {
  private Link head;
  private Link tail;
  private int ukuran;

  public void insertHead(int x, DoubleLinkedList doubleLinkedList) {
    // buat tautan baru dengan nilai yang melekat padanya
    Link newLink = new Link(x);
    // atur element pertama yang ditambahkan menjadi tail
    if (doubleLinkedList.isEmpty()) {
      tail = newLink;
    } else {
      head.previous = newLink;
    }
    newLink.next = head;
    head = newLink;
    ++ukuran;
  }

  public void insertTail(int x, DoubleLinkedList doubleLinkedList) {
    Link newLink = new Link(x);
    newLink.next = null;
    if (doubleLinkedList.isEmpty()) {
      tail = newLink;
      head = tail;
    } else {
      tail.next = newLink;
      newLink.previous = tail;
      tail = newLink;
    }
    ++ukuran;
  }

  // masukkan element ke dalam index
  public void insertElementByIndex (
    int x,
    int index,
    DoubleLinkedList doubleLinkedList
  ) {
    if (index > ukuran) {
      throw new IndexOutOfBoundsException(
        "indeks: " + index + ", ukruan: " + ukuran
      );
    }
    if (index == 0) {
      insertTail(x, doubleLinkedList);
    } else {
      if (index == ukuran) {
        insertTail(x, doubleLinkedList);
      } else {
        Link newLink = new Link(x);
        Link previousLink = head;
        for (int i = 1; i < index; i++) {
          previousLink = previousLink.next;
        }
        previousLink.next.previous = newLink;
        newLink.next = previousLink.next;
        newLink.previous = previousLink;
        previousLink.next = newLink;
      }
    }
    ++ukuran;
  }
  public Link deleteHead() {
    Link temp = head;
    head = head.next;

    if (head == null) {
      tail = null;
    } else {
      head.previous = null;
    }
    --ukuran;
    return temp;
  }

  public Link deleteTail() {
    Link temp = tail;
    tail = tail.previous;

    if (tail == null) {
      head = null;
    } else {
      tail.next = null;
    }
    --ukuran;
    return temp;
  }

  // hapus element data dari list
  public void delete(int x) {
    Link current = head;

    while (current.value != x) {
      if (current != tail) {
        current = current.next;
      } else {
        throw new RuntimeException(
          "element yang ingin dihapus tidak ada"
        );
      }
    }
    if (current == head) {
      deleteHead();
    } else if (current == tail) {
      deleteTail();
    } else {
      current.previous.next = current.next;
      current.next.previous = current.previous;
    }
    --ukuran;
  }

  public void deleteNode(Link z) {
    if (z.next == null) {
      deleteTail();
    } else if (z == head) {
      deleteHead();
    } else {
      z.previous.next = z.next;
      z.next.previous = z.previous;
    }
    --ukuran;
  }

  public void removeDuplicate(DoubleLinkedList l) {
    Link linkOne = l.head;
    while (linkOne.next != null) {
      Link linkTwo = linkOne.next;
      while (linkTwo.next != null) {
        if (linkOne.value == linkTwo.value) {
          delete(linkTwo.value);
        }
        linkTwo = linkTwo.next;
      }
      linkOne = linkOne.next;
    }
  }

  public void reverse() {
    Link thisHead = this.head;
    Link thisTail = this.tail;

    this.head = thisTail;
    this.tail = thisHead;

    Link nextLink = thisHead;
    while (nextLink != null) {
      Link nextLinkNext = nextLink.next;
      Link nextLinkPrevious = nextLink.previous;
      nextLink.next = nextLinkPrevious;
      nextLink.previous = nextLinkNext;

      nextLink = nextLinkNext;
    }
  }

  public void clearList() {
    head = null;
    tail = null;
    ukuran = 0;
  }
}
