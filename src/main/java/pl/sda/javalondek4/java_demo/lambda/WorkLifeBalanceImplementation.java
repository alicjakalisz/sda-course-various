package pl.sda.javalondek4.java_demo.lambda;

public class WorkLifeBalanceImplementation implements WorkLifeBalance {

    @Override
    public void hardWork() {
        System.out.println("work");
    }

    @Override
    public void sleep(int time) {
        System.out.println("sleep");

    }
}
