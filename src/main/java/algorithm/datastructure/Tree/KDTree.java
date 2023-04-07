/**
 * pohon dimensional adalah struktur data partisi-ruang
 * untuk mengatur titik-titik dalam ruang k-dimensi.
 * pohon k-d adalah struktur data yang berguna untuk
 * beberapa aplikasi seperti melibatkan kunci pencarian
 * multidimensi
 */

package algorithm.datastructure.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;


public class KDTree {
  private Node root;
  private final int k;

  KDTree(int k) {
    this.k = k;
  }

  /**
   * buat k dimensional dari point tertentu
   * @param point array dari inisial poin
   */
  KDTree(Point[] points) {
    if (points.length == 0) throw new IllegalArgumentException(
      "point array tidak boleh kosong"
    );
    this.k = points[0].getDimensi();
    for (Point point : points) if (point.getDimensi() != k) throw new IllegalArgumentException(
      "point harus memliki dimensi yang sama"
    );
    this.root = build(points, 0);
  }

  /**
   * bangun pohon dimensi dari koordinat tertentu dari sebuah point
   */
  KDTree(int[][] pointsCoordinates) {
    if (pointsCoordinates.length == 0) throw new IllegalArgumentException(
      "Points array cannot be empty"
    );
    this.k = pointsCoordinates[0].length;
    Point[] points = Arrays
      .stream(pointsCoordinates)
      .map(Point::new)
      .toArray(Point[]::new);
    for (Point point : points) if (
      point.getDimensi() != k
    ) throw new IllegalArgumentException(
      "Points must have the same dimension"
    );
    this.root = build(points, 0);
  }
  
  static class Point {
    int[] koordinat;

    public int getKoordinat(int i) {
      return koordinat[i];
    }

    public int getDimensi() {
      return koordinat.length;
    }

    public Point(int[] koordinat) {
      this.koordinat = koordinat;
    }

    @Override
    public boolean equals(Object obj) {
      if (obj instanceof Point other) {
        if (other.getDimensi() != this.getDimensi()) return false;
        return Arrays.equals(other.koordinat, this.koordinat);
      }
      return false;
    }

    @Override
    public String toString() {
      return Arrays.toString(koordinat);
    }

    /**
     * cari komparasi antara jarak dua point
     * @param p1 point pertama
     * @param p2 point kedua
     */
    public static int komparasiJarak(Point p1, Point p2) {
      int jarak = 0;
      for (int i = 0; i < p1.getDimensi(); i++) {
        int t = p1.getKoordinat(i) - p2.getKoordinat(i);
        jarak += t * t;
      }
      return jarak;
    }

    /**
     * temukan perbedaan jarak antara dua point tanpa adanya parameter axis
     * yang spesifik
     * @param p1 point pertama
     * @param p2 point kedua
     */
    public static int komparasiJarakExecptAxis(Point p1, Point p2, int axis) {
      int jarak = 0;
      for (int i = 0; i < p1.getDimensi(); i++) {
        if (i == axis) continue;
        int t = p1.getKoordinat(i) - p2.getKoordinat(i);
        jarak += t * t;
      }
      return jarak;
    }
  }
  
  static class Node {
    private Point point;
    private int axis;
    private Node kiri = null;
    private Node kanan = null;

    Node(Point point, int axis) {
      this.point = point;
      this.axis = axis;
    }

    public Point getPoint() {
      return point;
    }

    public Node getKiri() {
      return kiri;
    }

    public Node getKanan() {
      return kanan;
    }

    public int getAxis() {
      return axis;
    }

    public Node getNearChild(Point point) {
      if (
        point.getKoordinat(axis) < this.point.getKoordinat(axis)
      ) {
        return kiri; 
      }
      else {
        return kanan;
      }
    }
    
    public Node getFarChild(Point point) {
      if (point.getKoordinat(axis) < this.point.getKoordinat(axis)) return kanan;
      else return kiri;
    }
    
    public int getAxisKoordinat() {
      return point.getKoordinat(axis);
    }
  }

  public Node getRoot() {
    return root;
  }

  private Node build(Point[] points, int depth) {
    if (points.length == 0) return null;
    int axis = depth % k;
    if (points.length == 1) return new Node(points[0], axis);
    Arrays.sort(points, Comparator.comparingInt(o -> o.getKoordinat(axis)));
    int median = points.length >> 1;
    Node node = new Node(points[median], axis);
    node.kiri = build(Arrays.copyOfRange(points, 0, median), depth + 1);
    node.kanan = build(
      Arrays.copyOfRange(points, median + 1, points.length),
      depth + 1
    );
    return node;
  }

  public void insert(Point point) {
    if (point.getDimensi() != k) throw new IllegalArgumentException(
      "dimensi poin salah"
    );
    root = insert(root, point, 0);
  }
  
  private Node insert(Node root, Point point, int depth) {
    int axis = depth % k;
    if (root == null) return new Node(point, axis);
    if (point.getKoordinat(axis)< root.getAxisKoordinat()) root.kiri = 
      insert(root.kiri, point, depth + 1);
    else root.kanan = insert(root.kanan, point, depth + 1);
    return root;
  }

  public Optional<Node> cari(Point point) {
    if (point.getDimensi() != k) throw new IllegalArgumentException(
      "dimensi poin salah"
    );
    return cari(root, point);
  }

  public Optional<Node> cari(Node root, Point point) {
    if (root == null) return Optional.empty();
    if (root.point.equals(point)) return Optional.of(root);
    return cari(root.getNearChild(point), point);
  }

  public Point findMin(int axis) {
    return findMin(root, axis).point;
  }

  public Node findMin(Node root, int axis) {
    if (root == null) return null;
    if (root.getAxis() == axis) {
      if (root.kiri == null) return root;
      return findMin(root.kiri, axis);
    } else {
      Node kiri = findMin(root.kiri, axis);
      Node kanan = findMin(root.kanan, axis);
      Node[] candidates = {kiri, root, kanan};
      return Arrays.stream(candidates).filter(Objects::nonNull).min(Comparator.comparingInt(a -> a.point.getKoordinat(axis))).orElse(null);
    }
  }

  public Point findMax(int axis) {
    return findMax(root, axis).point;
  }

  public Node findMax(Node root, int axis) {
    if (root == null) return null;
    if (root.getAxis() == axis) {
      if (root.kanan == null) return root;
      return findMax(root.kanan, axis);
    } else {
      Node kiri = findMax(root.kiri, axis);
      Node kanan = findMax(root.kanan, axis);
      Node[] candidates =  {kiri, root, kanan};
      return Arrays.stream(candidates).filter(Objects::nonNull).max(Comparator.comparingInt(a -> a.point.getKoordinat(axis))).orElse(null);
    }
  }

  public void delete(Point point) {
    Node node = cari(point).orElseThrow(() -> new IllegalArgumentException("point tidak ditemukan"));
    root = delete(root, node);
  }

  private Node delete(Node root, Node node) {
    if (root == null) return null;
    if (root.equals(node)) {
      if (root.kanan != null) {
        Node min = findMin(root.kanan, root.getAxis());
        root.point = min.point;
        root.kanan = delete(root.kanan, min);
      } else if (root.kiri != null) {
        Node min = findMin(root.kiri, root.getAxis());
        root.point = min.point;
        root.kiri = delete(root.kiri, min);
      } else return null;
    }
    if (root.getAxisKoordinat() < node.point.getKoordinat(root.getAxis())) {
      root.kiri = delete(root.kiri, node);
    } else {
      root.kanan = delete(root.kanan, node);
    }
    return root;
  }

  public Point findNearest(Point point) {
    return findNearest(root, point, root).point;
  }

  private Node findNearest(Node root, Point point, Node nearest) {
    if (root == null) return nearest;
    if (root.point.equals(point)) return root;
    int jarak = Point.komparasiJarak(root.point, point);
    int jarakExceptAxis = Point.komparasiJarakExecptAxis(root.point, point, root.getAxis());

    if (jarak < Point.komparasiJarak(nearest.point, point)) {
      nearest = root;
    }
    nearest = findNearest(root.getNearChild(point), point, nearest);
    if (jarakExceptAxis < Point.komparasiJarak(nearest.point, point)) {
      nearest = findNearest(root.getFarChild(point), point, nearest);
    }
    return nearest;
  }
}
