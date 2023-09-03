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

    public Child() {
        super();
    }

    public Child(int value, TypeA type) {
        // 자식의 기본 생성자에서 부모의 super()를 호출하고 있기 때문에 이 부분(super(value, type))이 없어도 error가 발생하지는 않는다.
        // 하지만 부모 생성자를 통한 초기화 과정이 수행되지 않는 점을 고려해야 한다
        super(value, type);

        this.value = value;
    }

    public static void main(String[] args) {
        new Child();  //기본 생성자가 필요하다. --> 부모의 기본생성자도 호출해주어야 한다. super()
        new Child(102, TypeA.A);
    }

}
