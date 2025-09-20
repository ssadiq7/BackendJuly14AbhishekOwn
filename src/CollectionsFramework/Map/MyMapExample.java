package CollectionsFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class MyMapExample {
    public static void main(String[] args) {
        // Create a Map using the HashMap implementation
        Map<String, Integer> studentGrades = new HashMap<>();

        // Add key-value pairs with the put() method
        studentGrades.put("David", 95);
        studentGrades.put("Emily", 88);
        studentGrades.put("Frank", 90);

        // Retrieve a value with the get() method
        System.out.println("Emily's grade: " + studentGrades.get("Emily")); // Output: Emily's grade: 88

        // Update a value
        studentGrades.put("David", 98); // The old value for "David" is replaced
        System.out.println("David's new grade: " + studentGrades.get("David")); // Output: David's new grade: 98

        // Check if a key or value exists
        System.out.println("Contains key 'Frank'? " + studentGrades.containsKey("Frank")); // Output: true
        System.out.println("Contains value 88? " + studentGrades.containsValue(88)); // Output: true

        // Remove a key-value pair
        studentGrades.remove("Frank");
        System.out.println("Map after removing Frank: " + studentGrades); // Example output: {David=98, Emily=88}

        // Get the size of the map
        System.out.println("Size of the map: " + studentGrades.size()); // Output: 2


        // Iterate over key-value pairs
        System.out.println("\n\nIterating over key-value pairs:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Student: " + key + ", Grade: " + value);
        }


        // Iterate over keys
        System.out.println("\n\nIterating over keys:");
        for (String key : studentGrades.keySet()) {
            System.out.println("Student name: " + key);
        }


        // Iterate over values
        System.out.println("\n\nIterating over values:");
        for (Integer value : studentGrades.values()) {
            System.out.println("Student grade: " + value);
        }


        // Clear the map
        System.out.println("\n\nClearing the map:");
        studentGrades.clear();
        System.out.println("Size of the map after clearing: " + studentGrades.size()); // Output: 0

    }
}
