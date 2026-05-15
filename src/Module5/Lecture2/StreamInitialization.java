package Module5.Lecture2;

import java.util.List;
import java.util.stream.Stream;

public class StreamInitialization {
    public static void main(String[] args) {
        // Stream.of()
        Stream<Integer> a = Stream.of(1, 2, 3);
        int n = (int) a.count();
        IO.println(n);

        // List.stream()
        List<Character> ls = List.of('1', '2', '3');
        Stream<Character> b = ls.stream();
        double sum = b.mapToDouble(Character::getNumericValue).sum();
        IO.println(sum);

        // Stream Builder
        Stream.Builder<String> builder = Stream.builder();
        builder.add("one"); builder.add("two"); builder.add("three");
        Stream<String> c = builder.build();
        c.forEach(IO::println);
    }
}
