//Overriding
//sebagai contoh, disini ada sebuah class dengan nama "BangunDatar" sebagai parent

//membuat parent class
class BangunDatar{
    //mendeklarasikan method hitung pada parent class
    void hitung(){
        System.out.println("Method hitung di parent class");
    }
}

class Persegi extends BangunDatar{
    int sisi = 10;
    
    //meng-override method hitung dari parent class
    void hitung(){
        int luas = this.sisi * this.sisi; 
        //keyword this digunakan untuk menunjuk class itu sendiri. dengan begitu
        //this.sisi berarti mengambil variabel sisi dari class yang ditunjuk
        
        
        System.out.println("Method hitung di child class");
        System.out.println("Luas Persegi : "+luas);
    }

    //lalu muncul pertanyaan, bagaimana caranya untuk memanggil method hitung yang
    //berada di parent class. 

    //caranya cukup mudah, yaitu dengan menggunakan keyword "super" sebelum 
    //pemanggilan method

    //contoh
    void memanggilMethodDiParent(){
        //keyword superi ini berfungsi untuk memanggil method yang berada di parent
        super.hitung();
    }
}

class Overriding{
    public static void main(String[] args){
        //mendeklarasi object persegi ke dalam variabel "persegi_1"
        Persegi persegi_1 = new Persegi();

        //memanggil method hitung
        persegi_1.hitung();

        //memanggil method memanggilMethodDiParent
        persegi_1.memanggilMethodDiParent();
    }
}
