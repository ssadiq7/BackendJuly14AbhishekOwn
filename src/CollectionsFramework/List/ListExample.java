package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        // Create a new List using the ArrayList implementation
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");        // Adds to the end
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("\nInitial List:\n" + fruits);

        // Add an element at a specific index
        fruits.add(1, "Grape");     // Inserts "Grape" at index 1
        System.out.println("\nList after adding Grape at index 1:\n" + fruits);

        // Access an element by index
        String firstFruit = fruits.get(0); // We can use getFirst() method as well
        System.out.println("\nFirst fruit: fruits.get(0) or getFirst() method\n" + firstFruit); // Output: Apple

        System.out.println("\nfruits.toString():");
        System.out.println(fruits.toString());

        // Update an element
        fruits.set(2, "Kiwi");      // Replaces the element at index 2
        System.out.println("\nList after updating element at index 2 using set method:\n" + fruits);

        // Remove an element
        fruits.remove("Orange");    // Removes the first occurrence of "Orange"
        System.out.println("\nList after removing Orange using element/object itself:\n" + fruits);

        // Remove an element by index
        fruits.remove(0);           // Removes the element at index 0 ("Apple") | Note: We can use removeFirst() method as well
        System.out.println("\nList after removing element using index at index 0 or using removeFirst() method:\n" + fruits); // This will call the toString() method of ArrayList

        // Check the size
        System.out.println("\nSize of the list:\n" + fruits.size());

        /************************************************/

        System.out.println("\nOther useful methods:");

        System.out.println("\ncontains(\"Banana\"):");
        System.out.println(fruits.contains("Banana"));

        System.out.println("\nindexOf(\"Grape\"): finding index of an element/object:");
        System.out.println(fruits.indexOf("Grape"));

        System.out.println("\nisEmpty():");
        System.out.println(fruits.isEmpty());

        System.out.println("\ngetLast():");
        System.out.println(fruits.getLast());

        System.out.println("\nremove(\"Orange\") [remove(Object o)] method:");
        System.out.println(fruits.remove("Orange")); // Returns false as Orange is not present in the list
        System.out.println("Removes the first occurrence of the specified element from this list,");
        System.out.println("If it is present or returns false if the element is not present in the list:");
    }

}
