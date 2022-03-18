package bellshade.algorithm.conversion;

// memanggil modul input
import java.util.Scanner;

public class BinaryToDecimal{
  public static void main(String[] args){
    // membuat input
    Scanner input = new Scanner(System.in);
    int BinaryNumber, BinCopy, d, s = 0, power = 0;
    
    System.out.print("masukkan angka biner: ");
    BinaryNumber = input.nextInt();

    // copy angka biner ke variabel baru
    BinCopy = BinaryNumber;
    
    while(BinCopy != 0){
      // BinCopy % 10 / 2
      d = BinCopy % 10;
      s += d * (int) Math.pow(2, power++);
      BinCopy /= 10;
    }
    System.out.println("desimalnya: " + s);
  }
}
