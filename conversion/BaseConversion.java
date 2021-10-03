package conversion;

import java.util.ArrayList;
import java.util.List;

public class BaseConversion {

    private static final List<Character> binary = new ArrayList<>(List.of(
            '0', '1'
    ));

    private static final List<Character> octal = new ArrayList<>(List.of(
            '0', '1', '2', '3', '4', '5', '6', '7'
    ));

    private static final List<Character> hexadecimal = new ArrayList<>(List.of(
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    ));

    private static String toBase(List<Character> base, int number) {
        StringBuilder result = new StringBuilder();
        for (int i = number; i > 0; i /= base.size()) {
            int reminder = i % base.size();
            Character reminderChar = base.get(reminder);
            result.append(reminderChar);
        }
        return result.reverse().toString();
    }

    private static List<Integer> toDecimal(List<Character> base, String number) {
        List<Integer> list = new ArrayList<>();
        int numberLength = number.length();

        for (int iteration = 0; iteration < numberLength; iteration++) {
            // pengubahan dimulai dari character paling akhir
            int currentIndex = numberLength - 1 - iteration;
            char currentChar = number.charAt(currentIndex);
            int currentCharBaseIndex = base.indexOf(currentChar);

            if (currentCharBaseIndex == 0) continue; // tidak perlu tambahkan angka 0

            // rumus toDecimal:
            // desimal = ∑(indexDigitPadaBase × ukuranBase ^ jumlahIterasi)
            // indexDigitPadaBase   = index character pada basis
            // ukuranBase           = banyaknya angka pada basis
            // jumlahIterasi        = jumlah iterasi angka
            list.add((int) (currentCharBaseIndex * Math.pow(base.size(), iteration)));
        }
        return list;
    }

    public static String decimalToBinary(int n) {
        return toBase(binary, n);
    }

    public static String decimalToOctal(int n) {
        return toBase(octal, n);
    }

    public static String decimalToHexadecimal(int n) {
        return toBase(hexadecimal, n);
    }

    public static List<Integer> binaryToDecimal(String bin) {
        return toDecimal(binary, bin);
    }

    public static List<Integer> octalToDecimal(String oct) {
        return toDecimal(octal, oct);
    }

    public static List<Integer> hexadecimalToDecimal(String hex) {
        return toDecimal(hexadecimal, hex);
    }

    public static void main(String[] args) {
        int number = 100;

        String binary = decimalToBinary(number);
        System.out.println(binary);                             // 1100100
        System.out.println(binaryToDecimal(binary));            // [4, 32, 64]

        String octal = decimalToOctal(number);
        System.out.println(octal);                              // 144
        System.out.println(octalToDecimal(octal));              // [4, 32, 64]

        String hexadecimal = decimalToHexadecimal(number);
        System.out.println(hexadecimal);                        // 64
        System.out.println(hexadecimalToDecimal(hexadecimal));  // [4, 96]
    }
}
