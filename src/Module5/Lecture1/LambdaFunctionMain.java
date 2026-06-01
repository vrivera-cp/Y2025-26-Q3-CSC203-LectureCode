package Module5.Lecture1;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunctionMain {
    public static void main(String [] args) {
        Function<Integer, String> function = x -> "Number: " + x;
        IO.println(function.apply(4));

        Predicate<Integer> predicate = x -> x % 2 == 0;
        IO.println(predicate.test(3));

        BiPredicate<Integer, String> biPredicate = (a, b) -> a >= b.length();
        IO.println(biPredicate.test(999, "Mochi"));

        Consumer<String> consumer = c -> IO.println(c);
        consumer.accept("Hello, world!");

        // Method Reference
        consumer = IO::println;
        consumer.accept("Hello, world!");

    }
}
