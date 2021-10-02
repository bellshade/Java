package Java.HackkerRank;

import java.util.*;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int c = a;
            for (int j = 0; j < n; j++) {
                c += Math.pow(2, j) * b;
                System.out.printf("%s ", c);
            }
            System.out.println();
        }
        in.close();
    }
}
