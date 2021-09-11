package ch07.part05.generics.basic;

public class TypeB {

    /** 제네릭 타입을 이용한 함수 정의 1 */
    public <T> T method1(T t) {
        return t;
    }

    /** 제네릭 타입을 이용한 static 함수 정의 2 */
    public static <T> T method2(T t) {
        return t;
    }

    /** 제네릭 타입을 이용한 함수 정의 3 - 제네릭 타입을 가진 파라미터 */
    public <T> T method3(TypeA<T> t) {
        return t.getT();
    }

    /** 제네릭 타입을 이용한 static 함수 정의 4 - 제네릭 타입을 가진 파라미터 */
    public static <T> T method4(TypeA<T> t) {
        return t.getT();
    }

    /** 아래의 형태는 불가능 */
//    public <T> T method5(TypeA<S> t) {
//        return t.getT();
//    }
//    public <T> T method6(TypeA<String> t) {
//        return t.getT();
//    }

    /** 어떤 타입이라도 파라미터로 받을 수 있고 리턴 타입도 어떤 클래스 타입이라도 허용하겠다는 의미이다 */
    /** 사용하는 시점에 타입이 결정되고 이 후에는 해당 타입으로 제한되는 제네릭과 차이가 있다. */
    public Object method7(Object o) {
        return "any object";
    }
}
