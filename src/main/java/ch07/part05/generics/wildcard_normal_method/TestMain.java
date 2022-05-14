package ch07.part05.generics.wildcard_normal_method;

public class TestMain {
    public static void main(String[] args) {
        Course<String> courseA = new Course<>("courseA");
        Course<Integer> courseB = new Course<>(100);

        displayCourseString(courseA);
      //displayCourseString(courseB);  //타입이 맞지 않아서 Error

        displayCourse(courseA);
        displayCourse(courseB);
    }

    public static void displayCourseString(Course<String> course) {
        System.out.println(course);
    }

    public static void displayCourse(Course<?> course) {
        System.out.println(course);
    }
}
