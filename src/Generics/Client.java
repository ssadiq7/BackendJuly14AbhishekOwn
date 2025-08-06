package Generics;

import java.util.*;

public class Client
{
    public static void main(String[] args) {
        Pair pair = new Pair();
        pair.setFirst("Abhishek");
        pair.setSecond(34.0);

        pair.setSecond("Kumar");

        Double d = (Double) pair.getSecond();

        GenericPair<String, Double> genericPair = new GenericPair<>();
        genericPair.setFirst("Abhishek");
        genericPair.setSecond(34.0);

//        genericPair.setSecond("Kumar");

        GenericPair genericPair2 = new GenericPair<>(); // Raw Type => genericPair2
        List list = new ArrayList(); // Raw Type => list

        Animal animal = new Animal("Rocky");
        Dog dog = new Dog("Bruce", "Alsatian");

        AnimalUtility.printName(animal);
        AnimalUtility.printName(dog);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(animal);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(dog);

        AnimalUtility.printFromList(animalList);
//        AnimalUtility.printFromList(dogList);

        AnimalUtility.printFromListGeneric(animalList);
        AnimalUtility.printFromListGeneric(dogList);

        AnimalUtility.printListPlaceholder(animalList);
        AnimalUtility.printListPlaceholder(dogList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

//        AnimalUtility.printListPlaceholder(integerList);
//        AnimalUtility.printFromListGeneric(integerList);

        Set<Integer> integerSet = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();

    }
}
