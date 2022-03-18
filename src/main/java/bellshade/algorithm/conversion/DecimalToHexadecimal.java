package bellshade.algorithm.conversion;

public class DecimalToHexadecimal {

    //Inisialisasi Input Decimal yang ingin di konversi
    //Inputan Angka dapat diubah sesuai yang diinginkan
    static int input = 1247;

    //Inisialisasi variabel hasil bagi
    //ini digunakan untuk menampung hasil setiap pembagian pada setiap perulangan
    int hasil_bagi;

    //Inisialisasi modulo untuk menampung sisa pembagian pada setiap perulangan
    //Yang akan digunakan untuk pengkonverisna ke Hexadecimal
    int [] modulo = new int[1000];
    

    public void konversi() {
        hasil_bagi = input;
        int i = 0;

        //Perulangan yang akan selesai jika hasil bagi sudah tidak dapat dibagi lagi dengan 16
        //Ini tahap inti untuk mendapatkan nilai modulo (sisa dari hasil bagi) 
        //Untuk pengkonversian ke Hexadecimal

        while (hasil_bagi >= 16) {

            System.out.println("\t \t" + hasil_bagi);
            System.out.print("Perulagan " +(i+1)+" -------------");
            //Perintah menampung nilai modulo pada Array
            modulo[i] = hasil_bagi % 16;
            System.out.println("   " + modulo[i]);


            //Perintah membagi Inputan/hasil bagi dengan angka 16
            //Dan dibulatkan kebawah untuk mencegah pembulatan ke atas yg salah
            hasil_bagi = (int) Math.floor(hasil_bagi / 16);
            System.out.println("\t \t" + hasil_bagi);
            i++;
        }
        //Perintah menampung nilai hasil bagi akhir pada Array
        modulo[i] = hasil_bagi;
        System.out.println("Sebelum Di Konversi : ");

        //Perulangan dimulai dari belakang
        //Karena pengkonversian dan penulisannya dimulai dari hasil bagi terakhir
        //Dan modulonya pun dimulai dari perulangan terakhir hingga pertama
        for (int j = i; j >= 0; j--) {
            System.out.print(modulo[j] + " ");
        }

        //Perulangan dimulai dari belakang
        //Karena pengkonversian dan penulisannya dimulai dari hasil bagi terakhir
        //Pemanggilan method toHexadecimal
        System.out.println("\nSesudah Di Konversi : ");
        for (int j = i; j >= 0; j--) {
            System.out.print(toHexadecimal(modulo[j]) + " "); 
        }

    }

    //Method mengkonversian dari hasil bagi dan modulo diatas
    //Mengembalikan nilai String yang sesuai dengan rules Hexadecimal
    public String toHexadecimal(int x){
        String hexadecimal = " ";
        String [] hexa =  {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        hexadecimal = hexa[x];
        return hexadecimal;
    }

    public static void main(String[] args) {

        System.out.println("\t **Fungsi Sederhana Konversi Desimal ke Heksadesimal** ");
        DecimalToHexadecimal app = new DecimalToHexadecimal();
        app.konversi();
    }

}
