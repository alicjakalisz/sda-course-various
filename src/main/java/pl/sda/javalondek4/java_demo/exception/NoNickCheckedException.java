package pl.sda.javalondek4.java_demo.exception;

public class NoNickCheckedException extends Exception {
    public NoNickCheckedException() {
    }

    public NoNickCheckedException(String message) {
        super(message);
    }

    public NoNickCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickCheckedException(Throwable cause) {
        super(cause);
    }

    public NoNickCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
