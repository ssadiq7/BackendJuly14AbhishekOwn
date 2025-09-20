package CollectionsFramework.Map.HashMap;

import java.util.HashMap;

public class MyHashMapExample {
    public static void main(String[] args) {

        // Initialize a HashMap with String keys and Integer values
        HashMap<String, Integer> studentAges = new HashMap<>();

        // Add key-value pairs with the put() method
        studentAges.put("Alice", 21);
        studentAges.put("Bob", 22);
        studentAges.put("Charlie", 20);

        // Retrieve a value with the get() method
        System.out.println("Alice's age is: " + studentAges.get("Alice")); // Output: Alice's age is: 21

        // Update a value by using put() with an existing key
        studentAges.put("Alice", 23);
        System.out.println("Alice's updated age is: " + studentAges.get("Alice")); // Output: Alice's updated age is: 23

        // Remove a key-value pair with the remove() method
        studentAges.remove("Bob");
        System.out.println("After removing Bob: " + studentAges); // Output: After removing Bob: {Alice=23, Charlie=20}

        // Check for a key or value
        System.out.println("Contains key 'Charlie': " + studentAges.containsKey("Charlie")); // true
        System.out.println("Contains value 21: " + studentAges.containsValue(21)); // false

        // Get the size
        System.out.println("Size of the map: " + studentAges.size()); // Output: Size of the map: 2

        // Iterate over key-value pairs using entrySet()
        System.out.println("\n\nIterating over key-value pairs aka entries:");
        for (HashMap.Entry<String, Integer> entry : studentAges.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // Iterate over keys using keySet().
        System.out.println("\n\nIterating over keys:");
        for (String name : studentAges.keySet()) {
            System.out.println("Student Name: " + name);
        }

        // Iterate over values using values()
        System.out.println("\n\nIterating over values:");
        for (Integer age : studentAges.values()) {
            System.out.println("Student Age: " + age);
        }

        // Clear the map
        System.out.println("\n\nClearing the map:");
        studentAges.clear();
        System.out.println("After clearing, size of the map: " + studentAges.size()); // Output: After clearing, size of the map: 0

    }
}
