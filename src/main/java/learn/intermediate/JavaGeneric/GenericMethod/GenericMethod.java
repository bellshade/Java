package learn.intermediate.JavaGeneric.GenericMethod;

public class GenericMethod {
    public static <T> int arrayCount(T[] array) {
        return array.length;
    }
}
