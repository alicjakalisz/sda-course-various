package pl.sda.javalondek4.java_demo.optional;

import java.util.Optional;

import static java.util.Objects.nonNull;

public class MySecret<T> {
    private T secret;

    public MySecret(T secret) {
        this.secret = secret;
    }

    // String - without null
    // String? - with null
    public T getSecret() {
        return secret;
    }

    public void setSecret(T secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "MySecret{" +
            "secret='" + secret + '\'' +
            '}';
    }

    public static void main(String[] args) {
        MySecret<String> realOne = new MySecret<>("I like learning and teaching JVM technologies:P");
        MySecret<String> withNullContent = new MySecret<>(null);
        printSecretLength(realOne);
        printSecretLength(withNullContent);

        MySecret<Integer> secretNumber = new MySecret<>(42);
        MySecret<Integer> secretNullNumber = new MySecret<>(null);
        var secretNumOne = secretNumber.getSecret(); // 42
        var secretNull = secretNullNumber.getSecret(); // null

        // Optional<Integer> // 42 and null
        Optional<Integer> number = Optional.of(42); // never ever null inside
        Optional<Integer> nullNumber = Optional.empty();
        Optional<Integer> nullNumber2 = Optional.ofNullable(null);
//        Optional<Integer> nullNumber3 = Optional.of(null); // don't do it at home:)
    }

    public static void printSecretLength(MySecret<String> mySecret) {
        int secretLen = mySecret.getSecret() != null ? mySecret.getSecret().length() : 0;
        secretLen = nonNull(mySecret.getSecret()) ? mySecret.getSecret().length() : 0;
        // the same functionality
//        if (mySecret.getSecret() != null) {
//            secretLen = mySecret.getSecret().length();
//        } else {
//            secretLen = 0;
//        }
        System.out.println("My secret has " + secretLen + " characters");
    }

    public static <T> void processSecret(T optional) {
        // make optional from T
        Optional<T> opt = Optional.ofNullable(optional);
        int number = 4;
        Optional<Integer> numberInsideOptional = Optional.of(number);

//        T unpacked = opt.get(); // don't do it!!!!

        T unpacked;
        if (opt.isPresent()) {
            unpacked = opt.get();
        } else {
            unpacked = null;
        }

        unpacked = opt.orElse(null);
        unpacked = (T) opt.or(() -> null);

        Optional<String> string = Optional.empty();
        Optional<String> fromOptional = string.or(() -> Optional.of("no value"));
    }
}
