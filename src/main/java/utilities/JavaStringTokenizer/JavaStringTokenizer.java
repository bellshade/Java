package utilities.JavaStringTokenizer;
import java.util.StringTokenizer;

public class JavaStringTokenizer {
    public static void main(String[] args) {
        
        // Memanggil contructor dengan 2 params
        StringTokenizer strings = new StringTokenizer("My name is Caroline."," ");
        
        // Melakukan looping untuk mencetak semua token yang tersedia
        while (strings.hasMoreTokens()) {  
            System.out.println(strings.nextToken());  
        }

        // Mencetak 1 token dari sebuah string 
        strings = new StringTokenizer("Hello, nice to meet you.");
        System.out.println(strings.nextToken(","));

        // Menghitung jumlah token dari sebuah string 
        strings = new StringTokenizer("Hello, nice to meet you.");
        System.out.println(strings.countTokens());

        // Melakukan looping untuk mencetak semua token yang tersedia
        strings = new StringTokenizer("Hello, world !"," ");
        while (strings.hasMoreElements()) {    
            System.out.println(strings.nextToken());
        }
    }
}
