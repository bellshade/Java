package learn.intermediate.javarecord;

public class JavaRecordMain {

    public static void main(String[] args) {

        // Creating an instance of the record
        User user = new User("test user", "test@mail.com", 21);

        // Accessing the record fields
        String name = user.name();
        int age = user.age();

        System.out.println(name);
        System.out.println(age);
        System.out.println(user);

        User anotherUser = new User("another user", "another@mail.com", 22);
        boolean equals = user.equals(anotherUser);

        System.out.println("are they equals "+equals);
    }
}
