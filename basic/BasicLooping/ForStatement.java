// looping adalah perulangan yang mengulangi
// suatu kode sebanyak kali yang ditentukan
// contoh:
// if(statement_pertama, statement_kedua, statement_ketiga){
//     kode_yang_mau_diulangi;
// }


// statement_pertama akan menginilialisasi nilai awal variabel
// statement_kedua akan mengecek kondisi apakah masih diulangi
// statement_ketiga akan menambahkan nilai variabel


public class ForStatement {
    public static void main(String[] args){
        for(int ulang = 0; ulang < 5; ulang++){
            // variabel ulang akan menabah terus sampai kondisi statement_kedua tidak terpenuhi
            // disini kondisinya yaitu kurang dari 5
            // dan yang kurang dari 5 adalah 0 1 2 3 4 maka akan terprint
            // variabel 0 akan menambah terus sampai kondisi statement_kedua sudah terpenuhi
            // output akan terus menampilkan angka 0 1 2 3 4 
            
            // output akan menampilkan tiap kodisi sudah di dalam for sudah dijalankan
            System.out.println(ulang);
        }
    }    
}
