package learn.intermediate.JavaGeneric;

import learn.intermediate.JavaGeneric.GenericClass.GenericClass;
import learn.intermediate.JavaGeneric.GenericMethod.GenericMethod;

public class JavaGeneric {
    public static void main(String[] args) {
        // membuat object generic dengan tipe data String
        GenericClass<String> data1 = new GenericClass<>("Bellshade");

        // membuat object generic dengan tipe data Integer
        GenericClass<Integer> data2 = new GenericClass<>(2022);

        // menampilkan data String dari data1
        System.out.println(data1.getData());

        // menampilkan data Integer dari data2
        System.out.println(data2.getData());

        // membuat array
        String[] events = {"Hacktoberfest", "Harbolnas", "PRJ"};
        Integer[] numbers = {1, 2, 4, 8, 16};

        // menampilkan panjang array dari events
        System.out.println(GenericMethod.arrayCount(events));

        // menampilkan panjang array dari numbers dengan explicit type arguments
        System.out.println(GenericMethod.<Integer>arrayCount(numbers));
    }
}
