package pl.sda.javalondek4.java_demo.exception;

public class NoNickRuntimeExc extends RuntimeException {
    public NoNickRuntimeExc() {
    }

    public NoNickRuntimeExc(String message) {
        super(message);
    }

    public NoNickRuntimeExc(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickRuntimeExc(Throwable cause) {
        super(cause);
    }

    public NoNickRuntimeExc(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
