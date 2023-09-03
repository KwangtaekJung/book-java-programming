package ch09.part01;

public class Child extends Parent {
    private int value = 2;

    {
        System.out.println("name=" + name);
        System.out.println("value=" + value);
//        System.out.println(type);

        System.out.println("super.name=" + super.name);
        System.out.println("super.value=" + super.value);
//        System.out.println(super.type);

        System.out.println("this.name=" + this.name);
        System.out.println("this.value=" + this.value);
//        System.out.println(this.type);
    }

    public static void main(String[] args) {
        new Child();
    }

}
