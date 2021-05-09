package pl.sda.javalondek4.java_demo.stacktrace;

public class StacktraceExample {

    public static void main(String args[]) {
        printLine(repeat("Hello!"));

        var input = repeat("Hello!");
        printLine(input);
    }

    public static void printLine(String str) {
        System.out.println("inside printLine() method");
        System.out.println(str);
    }

    public static String repeat(String s) {
        System.out.println("inside repeat() method");
        return s + s;
    }
}

/**
 * Stack calling order:
 * 1st
 * repeat // line 6
 * main
 *
 * 2nd
 * println // line 6 after repeat ends
 * main
 *
 * 3rd
 * repeat // line 8
 * main
 *
 * 4th
 * println
 * main
 */