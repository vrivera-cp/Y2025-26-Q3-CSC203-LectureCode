package Module1.Lecture4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>( // Or LinkedList<>()
                List.of(1, 2, 3)
        );

        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        numbers.remove(2); // Remove the value 3

        System.out.println(numbers);

        System.out.println(numbers.get(2));

        // Print all values
        for (int number : numbers) {
            System.out.println(number);
        }

        // Print all values using indices
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
