package utilities.JavaCurrency;

import java.util.Currency;

public class JavaCurrency {
    public static void main(String[] args) {

        // Menerima instance AUD dan JPY
        Currency mataUang1 = Currency.getInstance("AUD"); // AUD
        Currency mataUang2 = Currency.getInstance("JPY"); // JPY
        
        // Mengambil data kode mata uang
        System.out.println(mataUang1.getCurrencyCode()); // AUD
        System.out.println(mataUang2.getCurrencyCode()); // JPY

        // Mengambil data jumlah digit default mata uang
        System.out.println("Digit AUD : " + mataUang1.getDefaultFractionDigits()); // Digit AUD : 2
        System.out.println("Digit JPY : " + mataUang2.getDefaultFractionDigits()); // Digit JPY : 0

        // Mengambil data nama mata uang
        System.out.println(mataUang1.getDisplayName()); // Australian Dollar
        System.out.println(mataUang2.getDisplayName()); // Japanese Yen
    }
}
