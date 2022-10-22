package learn.intermediate.JavaPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.function.Predicate.not;

public class JavaPredicate {

    /**
     * method not dari {@link Predicate}
     * mengembalikan hasil negasi dari predicate yang dibuat
     * @param predicate Predicate<T> interface
     * @param list List<T>
     */
    static <T> void notStartsWith(Predicate<T> predicate, List<T> list) {
        System.out.println("Kota dengan awalan bukan huruf 'A'");
        for (int i = 0; i < list.size(); i++) {
            T city = list.get(i);


            if (not(predicate).test(city)) {
                System.out.println(city);
            }
        }
    }

    /**
     * method test dari {@link Predicate}
     * mengevaluasi predicate yang dibuat terhadap parameter yang digunakan
     * @param predicate Predicate<T>
     * @param list List<T>
     */
    static <T> void startsWith(Predicate<T> predicate, List<T> list) {
        System.out.println("Kota dengan awalan huruf 'A'");
        for (int i = 0; i < list.size(); i++) {
            T city = list.get(i);
            if (predicate.test(city)) {
                System.out.println(city);
            }
        }
    }

    public static void main(String[] args) {
        // membuat predicate untuk string dengan awalan 'A'
        Predicate<String> startsWithA = value -> value.startsWith("A");

        // membuat list untuk nama kota
        List<String> cityList = new ArrayList<>(4) {
            {
                add("Ankara");
                add("Turkey");
                add("Turin");
                add("Paris");
            }
        };

        startsWith(startsWithA, cityList);
        notStartsWith(startsWithA, cityList);
    }
}
