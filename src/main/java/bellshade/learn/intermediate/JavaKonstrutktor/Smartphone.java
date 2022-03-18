package bellshade.learn.intermediate.JavaKonstrutktor;



public class Smartphone {

    String namaBrand;
    int kapasitasMemory;
    String prosesor; //Contoh kontraktor tidak disini

    // Untuk penamaan kontraktor, samakan dengan nama kelas yang dibuat
    public Smartphone(){

        // penggunaan `this.` adalah optional, tapi saya sarankan tetep menggunakannya
        this.namaBrand = "Samsung";
        this.kapasitasMemory = 6;
    }
}
