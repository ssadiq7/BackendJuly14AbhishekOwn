package lambdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient
{
    public static void main(String[] args)
    {
        List<Integer> list = List.of(71, 2, 7, 3, 4, 6, 6, 10, 1, 9, 8, 9, -12);

        List<Integer> evenList = new ArrayList<>();
        for (Integer i : list)
        {
            if(i % 2 == 0)
                evenList.add(i);
        }

        Stream<Integer> stream = list.stream();
        Stream<Integer> stream1 = stream.filter((i) -> {
            if(i % 2 == 0) return true;
            return false;
        });

        List<Integer> evenIntegerList = stream1.collect(Collectors.toList());
        System.out.println(evenIntegerList);

        //filter
        List<Integer> filteredList =
                list.stream()
                        .filter((element) -> { return element % 2 == 0;})
                        .collect(Collectors.toList());

        System.out.println(filteredList);

        //map
        List<Integer> squares =
                list.stream()
                        .map((element) -> { return element * element;})
                        .collect(Collectors.toList());
        System.out.println(squares);

        // filter + map
        List<Integer> filteredSquares =
                list.stream()
                        .filter((element) -> { return element % 2 == 0;})
                        .map((element) -> { return element * element;})
                        .collect(Collectors.toList());

        System.out.println(filteredSquares);

        // filter + map optimized(another way)
        List<Integer> filteredSquaresOptimized =
                list.stream()
                        .filter((element) -> element % 2 == 0)
                        .map((element) -> element * element)
                        .collect(Collectors.toList());

        System.out.println(filteredSquaresOptimized);

        // filter + map + distinct
        List<Integer> filteredSquaresDistinct=
                list.stream()
                        .filter((element) -> element % 2 == 0)
                        .map((element) -> element * element)
                        .distinct()
                        .collect(Collectors.toList());

        System.out.println(filteredSquaresDistinct);

        // filter + map + distinct + sorted
        List<Integer> filteredSquaresDistinctSorted =
                list.stream()
                        .filter((element) -> element % 2 == 0)
                        .map((element) -> element * element)
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());

        System.out.println(filteredSquaresDistinctSorted);

        // stream api advantages
        Optional<Integer> filteredSquaresList =
                list.stream()
                        .filter((element) -> {
                            System.out.println("Filtered element: " + element);
                            return element % 2 == 0;})
                        .map((element) -> {
                            System.out.println("Mapped element: " + element);
                            return element * element;})
                        .sorted()
                        .findFirst();

        System.out.println(filteredSquaresList.get());
    }
}
