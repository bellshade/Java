package utilities.JavaIterator;
import java.util.Iterator;
import java.util.ArrayList;

public class JavaIterator {
    public static void main(String[] args) {

        // Deklarasi ArrayList
        ArrayList<String> langs = new ArrayList<String>();

        // Mengisi ArrayList sebanyak 4 data String
        langs.add("Java");
        langs.add("Python");
        langs.add("PHP");
        langs.add("Rust");

        // Memanggil method iterator()
        Iterator<String> itr = langs.iterator();

        // Looping untuk menampilkan elemen data collection
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Deklarasi ArrayList
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // Mengisi ArrayList sebanyak 4 data Integer
        nums.add(12);
        nums.add(77);
        nums.add(34);
        nums.add(29);

        // Memanggil method iterator()
        Iterator<Integer> itr2 = nums.iterator();

        // Looping untuk menghapus elemen data bilangan genap dalam collection
        while(itr2.hasNext()) {
            Integer n = itr2.next();
            if(n % 2 == 0) {
                itr2.remove();
            }
        }

        // Menampilkan collection
        System.out.println(nums);

        // Deklarasi ArrayList
        ArrayList<String> animals = new ArrayList<>();

        // Mengisi ArrayList sebanyak 4 data String
        animals.add("Cat");
        animals.add("Squid");
        animals.add("Tiger");
        animals.add("Wolf");

        // Memanggil method iterator()
        Iterator<String> itr3 = animals.iterator();

        // Melakukan action mencetak elemen data dalam collection
        itr3.forEachRemaining((animal) -> System.out.println(animal));
    }
}
