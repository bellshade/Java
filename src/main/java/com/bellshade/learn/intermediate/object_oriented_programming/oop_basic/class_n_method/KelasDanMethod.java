package com.bellshade.learn.intermediate.object_oriented_programming.oop_basic.class_n_method;

class People {
    // berikut cara pembuatan method pada class di Java
    void hello() {
        System.out.println("Hello Bellshade!");
    }
    void belajar() {
        System.out.println("Aku sedang belajar Java OOP!");
    }

    // cara pembuatan method dengan return type String
    String bellshade() {
        return "https://github.com/bellshade/Java";
    }
}

public class KelasDanMethod {
    public static void main(String[] args) {
        // inisiasi object orang dari kelas Orang;
        // untuk cara inisiasi object bisa di baca di file README.md
        People people = new People();

        // menjalankan method hello dari object orang
        people.hello();
        // memanggil method belajar dari object orang
        people.belajar();

        // memanggil method yang memiliki return type
        // untuk bisa memanggil method yang memiliki return type
        // harus di masukkan ke dalam variable

        String bellshade = people.bellshade();

        // atau bisa di print langsung di console
        System.out.println(people.bellshade());
    }
}
