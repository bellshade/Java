package algorithm.datastructure.Search;

public class BinarySearch {
    int binarySearch(int[] array, int key) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (array[m] == key) {
                return m;
            }
            if (array[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key = 40;
        int result = ob.binarySearch(array, key);
        System.out.println(key + " is in index : " + result);
    }
}
