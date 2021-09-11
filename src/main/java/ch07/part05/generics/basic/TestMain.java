package ch07.part05.generics.basic;

public class TestMain {
    public static void main(String[] args) {

        /** TypeB 객체 생성 - method1(), method2() 함수 사용 */
        TypeB b = new TypeB();

        String method1 = b.method1("Test1");
        System.out.println("method1 = " + method1);
        String method2 = TypeB.method2("Test2");
        System.out.println("method2 = " + method2);

        /** TypeA 객체 생성 - 제네릭 타입 사용 -> 제네릭 타입 반환 */
        TypeA<String> a1 = new TypeA<>("1");
        String t1 = a1.getT();

        String method3 = b.method3(a1);
        System.out.println("method3 = " + method3);
        String method4 = TypeB.method4(a1);
        System.out.println("method4 = " + method4);

        /** TypeA 객체 생성 - 제네릭 타입 사용 안함 -> Object 타입 반환 */
        TypeA a2 = new TypeA("2");
        Object t2 = a2.getT();

        Object method3_1 = b.method3(a2);
        System.out.println("method3_1 = " + method3_1);
        Object method4_1 = TypeB.method4(a2);
        System.out.println("method4_1 = " + method4_1);
    }
}
