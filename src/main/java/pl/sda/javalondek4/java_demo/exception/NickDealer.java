package pl.sda.javalondek4.java_demo.exception;

public class NickDealer {

    private ExceptionGenerator exceptionGenerator;

    public NickDealer(ExceptionGenerator exceptionGenerator) {
        this.exceptionGenerator = exceptionGenerator;
    }

    public String nickFromDealer() throws NoNickCheckedException {
        return exceptionGenerator.nick();
    }

    public String nick() {
        return exceptionGenerator.nickWithRuntimeException();
    }
}
