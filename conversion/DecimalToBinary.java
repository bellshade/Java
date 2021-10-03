import java.util.Scanner;

//KONVERSI BILANGAN DESIMAL KE BILANGAN BINER
class Converter{
    
    public static String toBinary(int angka){
        //Siapkan variabel tipe data String kosong
        String angka_binary = " ";
        //Looping parameter angka jika lebih dari 0
        while(angka > 0){
            //String kosong ditambah dengan sisa hasil bagi parameter angka.
            angka_binary = (angka % 2) + angka_binary;
            //parameter angka dibagi 2
            angka /= 2;
        }
        //Kembalikan variabel String angka_binary
        return angka_binary;
    }
}

public class DecimalToBinary {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka_saya;
        
        //Input untuk memasukkan angka desimal yang mau dirubah ke biner
        System.out.print("Masukkan angka desimal yang ingin dikonversi ke binary: "); angka_saya = input.nextInt();
        //Tampilkan hasil outputnya dengan memberi argumen di function toBinary 
        System.out.println(Converter.toBinary(angka_saya));
    }
    
}
