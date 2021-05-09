package pl.sda.javalondek4.java_demo.stacktrace;

public class Main {

    public static void main(String[] args) {
        firstMethod("any string");
        System.out.println("After first method call");
    }

    public static void firstMethod(String a) {
        System.out.println("firstMethod()");

//        secondMethod("another string");
        secondMethod(null);

        throw new RuntimeException("hahaha");
    }

    public static void secondMethod(String b) {
        System.out.println("b length: " + b.length());
        System.out.println("secondMethod()");
    }
}
