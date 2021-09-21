package Java.HackkerRank;

import java.util.*;

public class JavaLoops1 {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        input.close();
        N = input.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.printf("%d x %d = %d%n", N, i, N * i);
        }
    }
}
