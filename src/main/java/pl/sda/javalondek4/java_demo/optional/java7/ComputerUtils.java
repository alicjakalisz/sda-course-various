package pl.sda.javalondek4.java_demo.optional.java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputerUtils {

    private ComputerUtils() {
        throw new UnsupportedOperationException("This class shouldn't be instantiated!!!");
    }

    public static String getGraphicsCardModelFirstNaiveApproach(Computer computer) {
        return computer         // Computer
            .getGraphicsCard()  // GraphicsCard
            .getModel();        // String
    }

    public static String getGraphicsCardGoodApproach(Computer computer) {
//        if (computer.getGraphicsCard() == null) {
//            return null;
//        } else {
//            if (computer.getGraphicsCard().getModel() == null) {
//                return null;
//            } else {
//                return computer.getGraphicsCard().getModel();
//            }
//        }
        String result = null;
        if (computer != null) {
            GraphicsCard graphicsCard = computer.getGraphicsCard();
            if (graphicsCard != null) {
                result = graphicsCard.getModel();
            }
        }
        return result;
    }

    public static String getGCModelWithJava8(Computer computer) {
        return Optional.ofNullable(computer)
            .map(comp -> comp.getGraphicsCard())
            .map(graphicsCard -> graphicsCard.getModel())
            .orElse("no model");
    }

    public static String getGCModelWithJava8WithVar(Computer computer) {
        /*
        var in JavaScript
        var name = "Mariusz";
        var age = 18;
        name = age;
        age = "Ala"
         */
        var name = "Mariusz"; // String name = "Mariusz";
//        var surname = null; var must have type!!!
        var age = 5;
        var ageL = 5L;
        List<String> stringList = new ArrayList<String>(); // Java 6
        List<String> stringList2 = new ArrayList<>(); // Java 7
        var stringList3 = new ArrayList<>(); // better use that method below:) use new ArrayList<String>()
//        stringList3.get(0);
        var stringList4 = new ArrayList<String>(); // use this
//        stringList4.get(0);
//        String var; // var can be variable name :) var is context keyword!!!
        var var = "name"; // don't do it

//        Optional<Computer> maybeComputer = Optional.ofNullable(computer);
//        Optional<GraphicsCard> maybeGraphicCard = maybeComputer.map(comp -> comp.getGraphicsCard());
//        Optional<String> maybeModel = maybeGraphicCard.map(graphicsCard -> graphicsCard.getModel());
//        return Optional.ofNullable(computer)
//            .map(comp -> comp.getGraphicsCard())
//            .map(graphicsCard -> graphicsCard.getModel())
//            .orElse("no model");
        var maybeComputer = Optional.ofNullable(computer);
        var maybeGraphicCard = maybeComputer.map(comp -> comp.getGraphicsCard());
        var maybeModel = maybeGraphicCard.map(graphicsCard -> graphicsCard.getModel());
        // another approach
        var maybeModelOfGC = Optional.ofNullable(computer)
            .map(comp -> comp.getGraphicsCard())
            .map(graphicsCard -> graphicsCard.getModel());

        maybeModelOfGC.orElse("no model");

        return maybeModel.orElse("no model");
    }

    public static void main(String[] args) {
        Computer nullComputer = null;
        Computer withoutGraphicsCard = new Computer(null);
        Computer withUnknownModel = new Computer(new GraphicsCard(null));
        Computer personalComputer = new Computer(new GraphicsCard("nVidia RTX 380"));

        getGraphicsCardModelFirstNaiveApproach(withoutGraphicsCard);
        getGraphicsCardModelFirstNaiveApproach(withUnknownModel);
        getGraphicsCardModelFirstNaiveApproach(personalComputer);
        getGraphicsCardModelFirstNaiveApproach(nullComputer);
    }
}
