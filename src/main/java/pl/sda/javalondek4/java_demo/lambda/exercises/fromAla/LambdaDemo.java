package pl.sda.javalondek4.java_demo.lambda.exercises.fromAla;

public class LambdaDemo {
    public static void main(String[] args) {
        Playable<Long> footballPlayer= (speed)-> System.out.println("Football players speed is: " + speed + "km/h");
        Playable<String> gamesPlayer= (name)-> System.out.println("Game Player "+ name + " is playing");
        Playable<Integer> loser=(numerOfLostGames)-> System.out.println("Loser is losing his " + numerOfLostGames+ "th game.");footballPlayer.play(10L);
        gamesPlayer.play("Bartek");
        loser.play(5);
    }
}
