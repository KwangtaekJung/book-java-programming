package ch07.part03.innerclass;

public class Logger {

    public static class LogLevel {
        public static final int INFO = 1;
        public static final int WARNING = 2;
        public static final int ERROR = 3;
    }

    public static void log(int logLevel, String message) {
        if (logLevel == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (logLevel == LogLevel.WARNING) {
            System.out.println("WARNING: " + message);
        } else if (logLevel == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        }
    }

    public void test() {
        System.out.println("Test");
    }
}
