package Module5.Lecture2;

import java.util.ArrayList;
import java.util.List;

public class Pipeline {
    public static void main(String[] args) {
        // Data Initialization
        List<Cat> cats = new ArrayList<>(
                List.of(
                        new Cat("Pearl", 5),
                        new Cat("Harvest", 6),
                        new Cat(null, 999),
                        new Cat("Mochi", 7)
                )
        );

        // Stream Pipeline
        int totalAge = cats.stream() // Initialize Stream (Stream<Cat>)
                .map(cat -> cat.getAge()) // Map from cats to their ages (Stream<Integer>)
                .filter(age -> age < 100) // Filter out/Keep sane values (Stream<Integer>)
                .reduce(0, (a, b) -> a + b); // Sum ages (Integer)

        IO.println(totalAge);
    }
}
