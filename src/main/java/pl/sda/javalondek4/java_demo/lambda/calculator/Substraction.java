package pl.sda.javalondek4.java_demo.lambda.calculator;

@FunctionalInterface
public interface Substraction<T> {
    T sub(T a, T b);
}
