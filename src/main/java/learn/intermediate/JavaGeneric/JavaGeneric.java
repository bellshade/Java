package learn.intermediate.JavaGeneric;

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
    }
}
