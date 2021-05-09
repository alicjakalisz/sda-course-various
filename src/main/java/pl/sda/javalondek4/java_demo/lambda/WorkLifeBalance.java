package pl.sda.javalondek4.java_demo.lambda;

@FunctionalInterface
public interface WorkLifeBalance {
    void hardWork();
    default void sleep(int time) {}

    public static void main(String[] args) {
        // 1. implement WorkLifeBalance in separate class
        // 2. use WorkLifeBalance as anonymous class
        WorkLifeBalance workLifeBalance = new WorkLifeBalance() {
            @Override
            public void hardWork() {
                System.out.println("work");
            }

            @Override
            public void sleep(int time) {
                System.out.println("sleep");
            }
            // future feature
            // hardWork
//            () -> {}
//            // sleep
//            (int time) -> {}
            //
        };

        WorkLifeBalance workLifeBalanceAfterCovid = () -> System.out.println("Normal job");

    }
}
