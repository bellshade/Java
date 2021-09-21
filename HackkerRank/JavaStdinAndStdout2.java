package Java.HackkerRank;

import java.util.*;

public class JavaStdinAndStdout2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.close();
        // Write your code here.
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        String s = scan.nextLine();
        s = scan.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
