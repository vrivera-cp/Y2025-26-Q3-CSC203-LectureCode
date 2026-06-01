package Module5.Lecture1;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> data = List.of(1, 2, 3, 999, 4);

        int sum = data.stream()
                .filter(x -> x < 100)
                .reduce(0, (a, b) -> a + b);

        double mean = (double) sum / data.stream().filter(x -> x < 100).count();

        IO.println(mean);
    }
}
