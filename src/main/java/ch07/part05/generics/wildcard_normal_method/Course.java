package ch07.part05.generics.wildcard_normal_method;

public class Course<T> {

    private T t;

    public Course(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Course{" +
                "t=" + t +
                '}';
    }
}
