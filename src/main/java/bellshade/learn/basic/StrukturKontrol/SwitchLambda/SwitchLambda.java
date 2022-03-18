package bellshade.learn.basic.StrukturKontrol.SwitchLambda;

/** 
    Switch lambda hampir sama dengan switch case namun penulisannya singkat.
    Switch lambda digunakan untuk mempersingkat penulisan switch case biasa.
    Switch lambda setidaknya bisa mendukung Java versi 14 ke atas.
*/

public class SwitchLambda {
    public static void main(String[] args) {
        // Ubah value dari nilai jika ingin melihat output lain dari case
        char nilai = 'D';

        /** 
            Switch lambda tidak memerlukan keyword break.
            Hanya dengan menggunakan tanda -> untuk mencetak statement.
            Jika statement lebih dari 1, gunakan tanda kurung kurawal setelah tanda ->
        */
        switch (nilai) {
            // Hanya mencetak 1 statement
            case 'A' -> System.out.println("Anda lulus dengan sangat baik");

            // 2 case mencetak 1 statement
            case 'B', 'C' -> System.out.println("Anda lulus dengan baik");

            // 1 case mencetak 2 statement (bisa lebih dari 1) dengan kurung kurawal
            case 'D' -> {
                System.out.println("Anda tidak lulus");
                System.out.println("Belajar lebih giat lagi");
            }
            
            default -> System.out.println("Anda salah input");
        }
    }
}