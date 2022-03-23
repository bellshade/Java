package learn.basic.String;

// string dalam java adalah kumpulan dari karakter
// yang menggunakan tanda petik dua ("")


public class StringJavaMethod {
    public static void main(String[] args){
        String nama = "jols";
        String nama2 = "toer";

        // menggabungkan kedua string
        // pemberian string kosong bertujuan untuk
        // memberikan jarak spasi antara kedua string
        System.out.println(nama + " " + nama2);

        // menggabungkan dengan metode concat
        System.out.println(nama.concat(nama2));

        // menggabungkan dengan metode replace
        System.out.println(nama.replace("jols", "jol"));


        // ini tidak akan menghasilkan kalkulasi jika menggunakan
        // string dan akan menghasilkan output "2030"
        // String angka = "20";
        // String angka2 = "30";
        // System.out.println(angka + angka2);
    }
}
