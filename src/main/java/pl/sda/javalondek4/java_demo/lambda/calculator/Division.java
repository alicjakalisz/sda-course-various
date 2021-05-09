package pl.sda.javalondek4.java_demo.lambda.calculator;

@FunctionalInterface
public interface Division<T> {

    T div(T a, T b);
}
