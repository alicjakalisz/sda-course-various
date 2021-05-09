package pl.sda.javalondek4.java_demo.exception;

public class ExceptionExample {

    // checked exceptions - all inherited from Exception but RuntimeException
    // unchecked exceptions - all inherited from RuntimeException
    // errors - inherited directly from Throwable
    public static void main(String[] args)
    //    throws NoNickException // don't do it!!!
    {
        ExceptionGenerator exceptionGenerator = new ExceptionGenerator();
        // handle or declare
        // SOLID??
        String myNick;
        try { // first step
            myNick = exceptionGenerator.nick();
        } catch (NoNickCheckedException e) { // second - sometimes
            System.out.println("Problem with nick generator...");
            myNick = "this user has no nick";
        } finally { // third // always
            // myNick = "from finally:)"; // it always overrides nick:(
        }
        System.out.println("My nick is: " + myNick);

        System.out.println("Now with runtime exceptions...");
        try {
            myNick= exceptionGenerator.nickWithRuntimeException();
        }catch (NoNickRuntimeExc e){
            System.out.println("wyjatek z RuntimeException");
            myNick = "Przypisanie z runtimeExcepion";
        }
        System.out.println("My nick now is: " + myNick);
//        String nullString = null;
//        nullString.concat(" ma kota");

        System.out.println("With dealer:):):)");
        NickDealer nickDealer = new NickDealer(new ExceptionGenerator());

        String myNickDealer;
        try {
            myNickDealer =  nickDealer.nickFromDealer();
        } catch (NoNickCheckedException e) {
            myNickDealer = "default nick name";
        }
        System.out.println("Nick from myDealer: " + myNickDealer);

        try {
            myNickDealer = nickDealer.nick();
        } catch (NoNickRuntimeExc exc) {
            myNickDealer = "unexpected value....";
        }
        System.out.println("Nick from dealer: " + myNickDealer);
        System.out.println("here???");
    }
}
