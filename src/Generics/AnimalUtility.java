package Generics;

import java.util.List;
import java.util.Objects;

public class AnimalUtility
{
    public static void printName(Animal animal)
    {
        System.out.println(animal.getName());
    }

    public static void printFromList(List<Animal> animals)
    {
        for (Animal animal : animals)
        {
            printName(animal);
        }
    }

    public static <T extends Animal> T printFromListGeneric(List<T> animals)
    {
        for (T animal : animals)
        {
            printName(animal);
        }

        return animals.get(0);
    }

    public static void printListPlaceholder(List<? extends Animal> animals)
    {
        for (Animal animal : animals)
        {
            printName(animal);
        }
    }
}
