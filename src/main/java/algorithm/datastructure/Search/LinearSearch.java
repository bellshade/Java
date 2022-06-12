package algorithm.datastructure.Search;

import java.util.Arrays;

public class LinearSearch {
    public static <T, S> int linearSearch(T[] array, S key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {10, 15, 25, 35, 40, 70};
        String[] arrayString = {"Eat", "Sleep", "Repeat"};
        int key1 = 40;
        String key2 = "Sleep";
        System.out.println("array to be search: " + Arrays.toString(arrayInt));
        System.out.println(key1 + " is found at index: " + linearSearch(arrayInt, key1));
        System.out.println("array to be search: " + Arrays.toString(arrayString));
        System.out.println(key2 + " is found at index: " + linearSearch(arrayString, key2));
    }
}
