package course.sololearn;
import java.util.Scanner;

//KONVERSI BILANGAN DESIMAL KE BILANGAN BINER
class Converter{
    
    public static String toBinary(int angka){
        String angka_binary = " ";
        while(angka > 0){
            angka_binary = (angka % 2) + angka_binary;
            angka /= 2;
        }
        return angka_binary;
    }
}

public class DecimalToBinary {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka_saya;
        
        System.out.print("Masukkan angka desimal yang ingin dikonversi ke binary: "); angka_saya = input.nextInt();
        System.out.println(Converter.toBinary(angka_saya));
    }
    
}
