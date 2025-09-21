package CollectionsFramework.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefaultExample {
    public static void main(String[] args) {
        Map<String, String> config = new HashMap<>();
        config.put("theme", "dark");
        config.put("language", "en");

        // Key "theme" exists, so its value is returned
        String theme = config.getOrDefault("theme", "light");
        System.out.println("Theme: " + theme); // Output: Theme: dark

        // Key "fontSize" does not exist, so the default value is returned
        String fontSize = config.getOrDefault("fontSize", "12px");
        System.out.println("Font Size: " + fontSize); // Output: Font Size: 12px

        // Verify that the map was not modified
        System.out.println("Map after getOrDefault calls: " + config);
        // Output: Map after getOrDefault calls: {theme=dark, language=en}

        // Unlike putIfAbsent, getOrDefault does not modify the map
        // The non-existent key "fontSize" is not added to the map
    }
}
