package CollectionsFramework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsentExample {

    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("Alice", "123-4567");

        String oldValue1 = contacts.putIfAbsent("Alice", "987-6543");
        System.out.println("Returned value for Alice: " + oldValue1);

        String oldValue2 = contacts.putIfAbsent("Bob", "555-1234");
        System.out.println("Returned value for Bob: " + oldValue2);

        // Directly printing the map to see the final state
        System.out.println("Updated map: " + contacts); // Output: {Alice=123-4567, Bob=555-1234}
        // This will call the toString() method of HashMap
        System.out.println("Updated map: " + contacts.toString());
    }

}
