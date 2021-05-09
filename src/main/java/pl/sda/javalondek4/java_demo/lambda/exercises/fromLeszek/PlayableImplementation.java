package pl.sda.javalondek4.java_demo.lambda.exercises.fromLeszek;

public class PlayableImplementation {
    public static void main(String[] args) {
        Playable<Integer, String> footballPlayer = (Integer value, Integer score, String comment) -> {
            System.out.println("This football player is worth £" + value + " and scored in last match " + score + " times.");
            System.out.println("His motto is: " + comment);
            return value * score * 4;
        };
        Playable<Integer, String> gamesPlayer = (Integer value, Integer score, String comment) -> {
            System.out.println("This game player is worth £" + value + " and scored in last match " + score + " times.");
            System.out.println("His motto is: " + comment);
            return value * score * 2;
        };
        Playable<Integer, String> looser = (Integer value, Integer score, String comment) -> {
            System.out.println("This looser is worth £" + value + " and he lost recently " + score + " times.");
            System.out.println("His motto is: " + comment);
            return value * score * -1;
        };
        Integer earnings = footballPlayer.play(25000, 5, "Happy Living");
        earnings = earnings + gamesPlayer.play(10000, 6, "Never give up");
        earnings = earnings + looser.play(50000, 8, "Almost there");
        System.out.println("--------------------------------------------");
        System.out.println("Total earnings after season: " + earnings);
    }
}
