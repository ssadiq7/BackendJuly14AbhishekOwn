package lambdasStreamsAndExceptionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client
{
    public static void main(String[] args)
    {
        List<Item> items = new ArrayList<Item>();

        items.add(new Electronics("E1", "Laptop", 5 , 999.99, 24));
        items.add(new Clothing("C1", "T-Shirt", 100 ,19.99, "M"));
        items.add(new Book("B1", "Java Programming", 50, 59.99, "John Doe"));
        items.add(new Electronics("E2", "Tablet", 2 , 1299.99, 24));

        // Task 1
        items.stream()
                .map(item -> item.getId())
                .forEach((data) -> System.out.println(data));

        items.stream()
                .map(item -> item.getName().toLowerCase())
                .forEach(System.out::println);

        items.stream()
                .map(item -> item.getName().length())
                .forEach(System.out::println);

        // Task 2
        items.stream()
                .filter(item -> item.getPrice() > 1000)
                .forEach((data) -> System.out.println(data.getName()));

        boolean hasQuantityZero = items.stream()
                .anyMatch(item -> item.getQuantity() > 0);
        System.out.println(hasQuantityZero);

        boolean hasPriceGreaterThanZeroAll = items.stream()
                .allMatch(item -> item.getPrice() > 0);
        System.out.println(hasPriceGreaterThanZeroAll);

        boolean hasNegativeQuantity = items.stream()
                .noneMatch(item -> item.getQuantity() < 0);
        System.out.println(hasNegativeQuantity);

        // Task 3
        List<String> filteredList = items.stream()
                .filter(item -> item.getQuantity() > 0 && item.getPrice() > 1000)
                .map(item -> item.getName())
                .distinct()
                .sorted()
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(filteredList);

        // Task 4
        int totalQuantity = 0;
        for (Item item : items)
        {
            totalQuantity += item.getQuantity();
        }

        int totalQuantityByReduce = items.stream()
                .map(item -> item.getQuantity())
                .reduce(0, (total, quantity) -> total + quantity);

        int totalQuantityByReduce1 = items.stream()
                        .map(item -> item.getQuantity())
                        .reduce(0, (total, quantity) -> {
                                    total = total + quantity;
                                    return total;
                                });

        System.out.println(totalQuantityByReduce1);

        Double mostExpensiveItemPrice = items.stream()
                .map(item -> item.getPrice())
                .reduce(Double.MIN_VALUE, (maxPrice, price) -> Math.max(maxPrice, price));

        System.out.println(mostExpensiveItemPrice);

        Optional<String> concatenatedNames = items.stream()
                .map(item -> item.getName())
                .reduce((placeholder, curr) -> placeholder + "," + curr);

        System.out.println(concatenatedNames.get());

        Optional<Item> mostExpensiveItemOptional = items.stream()
                .reduce((item1, item2) -> item1.getPrice() > item2.getPrice() ? item1 : item2);

        Item mostExpensiveItem = mostExpensiveItemOptional.get();
        System.out.println(mostExpensiveItem.getName());
    }
}
