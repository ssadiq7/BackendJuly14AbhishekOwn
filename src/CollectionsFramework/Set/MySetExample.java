package CollectionsFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySetExample {
    public static void main(String[] args) {
        // Create a new Set using the HashSet implementation
        Set<String> uniqueFruits = new HashSet<>();

        // Add elements to the set using the add() method
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Orange");

        // Attempt to add a duplicate element
        boolean wasAdded = uniqueFruits.add("Apple"); // Returns false
        System.out.println("Was 'Apple' added again? " + wasAdded); // Output: false

        // Print the set and notice the unpredictable order
        System.out.println("Set of unique fruits: " + uniqueFruits); // Example output: [Apple, Orange, Banana]

        // Check if an element exists using the contains() method
        System.out.println("Does the set contain 'Banana'? " + uniqueFruits.contains("Banana")); // true

        // Remove an element using the remove() method
        uniqueFruits.remove("Orange");
        System.out.println("After removing 'Orange': " + uniqueFruits); // Example output: [Apple, Banana]

        // Get the number of elements in the set
        System.out.println("Number of elements: " + uniqueFruits.size()); // Output: 2



        // Iterating with a for-each loop
        System.out.println("Iterating through the set:");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }

        // Example with a LinkedHashSet to demonstrate insertion order
        System.out.println("\n\nUsing LinkedHashSet to maintain insertion order:");
        Set<String> orderedFruits = new LinkedHashSet<>();
        orderedFruits.add("Strawberry");
        orderedFruits.add("Grape");
        orderedFruits.add("Blueberry");
        System.out.println("LinkedHashSet (maintains insertion order): " + orderedFruits); // [Strawberry, Grape, Blueberry]

        // Example with a TreeSet to demonstrate sorted order
        System.out.println("\n\nUsing TreeSet to maintain sorted order:");
        Set<String> sortedFruits = new TreeSet<>();
        sortedFruits.add("Strawberry");
        sortedFruits.add("Grape");
        sortedFruits.add("Blueberry");
        System.out.println("TreeSet (sorted alphabetically): " + sortedFruits); // [Blueberry, Grape, Strawberry]

    }
}
