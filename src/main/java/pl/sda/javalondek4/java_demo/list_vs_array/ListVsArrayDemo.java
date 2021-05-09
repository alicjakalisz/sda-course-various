package pl.sda.javalondek4.java_demo.list_vs_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListVsArrayDemo {

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3 }; // 3 elements, array is object
        Object objectArray = intArray;
//         Object i = 5;
        Object i = Integer.valueOf(1);
        Integer[] integers = { Integer.valueOf(1), 2, 3 };
        Object[] whatIsIt = integers;
//        whatIsIt = intArray; // doesn't work
        objectArray = integers;

//        long[] longArray = { 1, 2, 3 };
//        playWithArrays(longArray);

        String[] strings = { "one", "two" };
        playWithArrays(strings);

        Object a = 5;
        Integer objectInt = 5; // conversion - boxing
        Integer objectInt2 = new Integer(5); // never ever use Wrapper's constructors
        Integer b = Integer.valueOf(5);

        // Object -> Animal -> Dog/Cat
        Animal someAnimal = new Cat();
        someAnimal = new Dog();
        Cat[] cats = { null, new Cat() };
        Dog[] dogs = { new Dog() };

        addDog(dogs);
//        addDog(cats); // it's unsafe!!!
        Cat isItCat = cats[0];

        List<Dog> dogList = List.of(new Dog(), new Dog());
//        dogList.add(new Dog()); // immutable collection - cannot add!!! UnsupportedOperationException
        List<Dog> dogList1 = new ArrayList<>();
        dogList1.add(new Dog());
        dogList1.add(new Dog());
        List<Dog> fromArray = Arrays.asList(new Dog(), new Dog());
//        fromArray.add(new Dog()); // UnsupportedOperationException
        Dog[] newDogArray = fromArray.toArray(new Dog[0]);
        List<Cat> catList = List.of(new Cat());

        String[] someStrings = { "Ala", "ma", "kota" };
        List<String> stringList = Arrays.asList(someStrings);
        System.out.println("Array of strings: " + someStrings.toString() + " with length: " + someStrings.length);
        System.out.println("Array of strings: " + Arrays.toString(someStrings));
        System.out.println("string list: " + stringList);

        someStrings[1] = "nie ma";
        System.out.println("Array of strings: " + Arrays.toString(someStrings));
        System.out.println("string list: " + stringList);

        Animal[] animals = { new Dog(), new Cat() };
        showTabAnimals(cats);
        showTabAnimals(dogs);
        showTabAnimals(animals);
    }

    public static void addDog(Animal[] animals) {
        animals[0] = new Dog(); // arrays always remember its type!!!
    }

    public static void showTabAnimals (Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null) {
                animal.saySomething();
            } else {
                System.out.println("reference is null!!!");
            }
        }
    }

    public static void showTabAnimalsStreamVersion(Animal[] animals) {
//        List<Animal> animalList = List.of(animals);
//        animalList.stream()
        Stream.of(animals)
            .forEach((animal) -> {
                if (animal != null) {
                    animal.saySomething();
                } else {
                    System.out.println("reference is null!!!");
                }
            });
    }

    public static void playWithArrays(Object maybeArray) {
        if (maybeArray instanceof int[]) {
            int[] intArray2 = (int[]) maybeArray;
        }

    }
}
