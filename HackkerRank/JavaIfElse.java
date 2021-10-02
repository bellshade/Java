package Java.HackkerRank;

import java.util.*;

public class JavaIfElse {
    public static void main(String[] args) {
        String ans;
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        input.close();
        if (N % 2 == 1 || N >= 6 && N <= 20) {
            ans = "Weird";
            System.out.println(ans);
        } else if (N % 2 == 0 || N >= 2 && N <= 5) {
            ans = "Not Weird";
            System.out.println(ans);
        } else {
            ans = "Not Weird";
            System.out.println(ans);
        }
    }
}
