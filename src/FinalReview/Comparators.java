package FinalReview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import java.util.Random;

public class Comparators {
    public static Random random = new Random();
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (var i = 0; i < 8; i++) numbers.add(random.nextInt(0, 100));

        IO.println(numbers);

        Comparator<Integer> comparator = (a, b) -> {
            if (a < b) {
                return -123;
            } else if (b < a) {
                return 456;
            }
            return 0;
        };

        // comparator = (a, b) -> b - a; // Same effect, only for integers
        // comparator = (a, b) -> a - b; // Descending, only for integers

        numbers.sort(comparator);

        IO.println(numbers);
    }
}
