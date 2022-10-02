package learn.intermediate.JavaGeneric;

public class GenericClass<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericClass(T data) {
        this.data = data;
    }
}
