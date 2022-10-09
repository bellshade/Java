package learn.intermediate.JavaGeneric;

import learn.intermediate.JavaGeneric.AbstractGenericClass.model.Baju;
import learn.intermediate.JavaGeneric.AbstractGenericClass.model.Celana;
import learn.intermediate.JavaGeneric.GenericClass.GenericClass;
import learn.intermediate.JavaGeneric.GenericClassMultiParameter.GenericClassMultiParameter;
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

        
        // Membuat objek `GenericClassMultiParameter` dimana T diinisiasi objek Baju dan K diinisiasi Integer
        GenericClassMultiParameter<Baju,Integer> data3  =
                new GenericClassMultiParameter<>(new Baju(26,72,59),6);
        System.out.println("Data3 Objek bertipe data: " + data3.getDataObjek().getClass().getSimpleName());
        System.out.println("Data3 key bertipe data: " + data3.getDataKey().getClass().getSimpleName());

        // Membuat objek `GenericClassMultiParameter` dimana T diinisiasi objek Celana dan K diinisiasi String
        GenericClassMultiParameter<Celana, String> data4  =
                new GenericClassMultiParameter<>(new Celana(26,72,59),"Str6");
        System.out.println("Data4 Objek bertipe data: " + data4.getDataObjek().getClass().getSimpleName());
        System.out.println("Data4 key bertipe data: " + data4.getDataKey().getClass().getSimpleName());
    }
}
