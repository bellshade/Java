package learn.basic.Operator.Unary.IncreDecre;

public class IncreDecre {
    public static void main(String[] args) {
        int angka;

        angka  = 10;
        System.out.println("\n Penggunaan prefix Increment");
        System.out.println("Nilai awal inputan adalah : " + angka);
        System.out.println("Operator ++x = " + ++angka);
        System.out.println("Nilai inputan sekarang = " + angka);

        angka = 10;
        System.out.println("\n\n Penggunaan prefix Decrement");
        System.out.println("Nilai awal inputan adalah : " + angka);
        System.out.println("Operator --x = " + --angka);
        System.out.println("Nilai inputan sekarang = " + angka);

        angka = 10;
        System.out.println("\n\n Penggunaan postfix Increment");
        System.out.println("Nilai awal inputan adalah : " + angka);
        System.out.println("Operator x++ = " + angka++);
        System.out.println("Nilai inputan sekarang = " + angka);

        angka = 10;
        System.out.println("\n\n Penggunaan postfix Decrement");
        System.out.println("Nilai awal inputan adalah : " + angka);
        System.out.println("Operator x-- = " + angka--);
        System.out.println("Nilai inputan sekarang = " + angka);
    }
}