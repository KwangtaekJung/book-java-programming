package ch06.part02;

public class TestMain {
    public static void main(String[] args) {

        /* 배열 생성 및 사용 방법[1] */
        String[] array1 = new String[]{"자료1", "자료2", "자료3", "자료4", "자료5"};

        if (array1 != null) {
            for (String s : array1) {
                System.out.println("s = " + s);;
            }
        }
    }
}
