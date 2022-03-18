package learn.basic.StrukturKontrol.SwitchYield;

/** 
    Switch yield hampir sama dengan switch case namun penulisannya singkat.
    Switch yield digunakan untuk meng-return nilai ke sebuah variable.
    Namun switch yield hanya dapat meng-return 1 nilai saja.
    Switch yield setidaknya bisa mendukung Java versi 14 ke atas.
*/

public class SwitchYield {
    public static void main(String[] args) {
        // Ubah value dari nilai jika ingin melihat output lain dari case
        char nilai = 'A';
        
        /** 
            Switch yield tidak memerlukan keyword break.
            Hanya dengan menggunakan keyword yield untuk memberi value ke variable.
            Hanya dapat meng-return 1 nilai dari tiap case yield yang cocok.
        */

        
        /** 
            Variable ucapan akan diisi dengan value berdasarkan kecocokan value variable nilai.
            Misal jika cocok dengan case 'A', maka variable ucapan akan berisi
            value "Anda lulus dengan sangat baik".
        */
        String ucapan = switch (nilai) {
            case 'A':
                yield "Anda lulus dengan sangat baik";
            case 'B', 'C':
                yield "Anda lulus dengan baik";
            case 'D':
                yield "Anda tidak lulus";
            default :
                yield "Anda salah input";
        };

        // Mencetak value variable ucapan
        System.out.println(ucapan);
    }
}