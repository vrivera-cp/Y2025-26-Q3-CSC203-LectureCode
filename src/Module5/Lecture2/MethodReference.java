package Module5.Lecture2;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
    public void main(String[] args) {
        // Method Reference
        Consumer<String> c = IO::println;
        c.accept("Hello, world!");

        // Static methods
        Function<Integer, Integer> f1 = Cat::humanAge;
        IO.println(f1.apply(8));

        // Instance Method, explicit parameter
        Cat cat = new Cat("Mochi", 1234);
        BiFunction<Cat, Integer, String> f2 = Cat::meow;
        IO.println(f2.apply(cat, 3));

        // Instance Method, implicit parameter
        Function<Integer, String> f3 = cat::meow;
        IO.println(f3.apply(4));
    }
}
