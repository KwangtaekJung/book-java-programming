package ch07.part05.generics.basic;

public class TypeA<T> {

    private T t;

    public TypeA(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
