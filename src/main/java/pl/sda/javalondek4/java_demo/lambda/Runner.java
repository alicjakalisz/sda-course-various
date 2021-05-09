package pl.sda.javalondek4.java_demo.lambda;

// This should be Functional Interface!!!!
@FunctionalInterface
public interface Runner {

    void go();
    default void go(int speed) {
        System.out.println("My current speed is: " + speed);
    }
    static void walk() {
        System.out.println("static walk method");
    }
}
