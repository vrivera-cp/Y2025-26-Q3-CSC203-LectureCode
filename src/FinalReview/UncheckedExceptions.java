package FinalReview;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class UncheckedExceptions {

    public static void printlnDepth(String string, int depth) {
        for (int i = 0; i < depth; i++) string = "\t" + string;
        IO.println(string);
    }

    public static void main(String[] args) {
        Consumer<Integer> f = UncheckedExceptions::functionD;
        printlnDepth("Main Start", 0);
        try {
            f.accept(1);
        } catch (ArithmeticException e) {
            printlnDepth("Main Arithmetic", 0);
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            printlnDepth("Main IndexOutOfBounds | NullPointer", 0);
        } finally {
            printlnDepth("Main Finally", 0);
        }

        printlnDepth("Main End", 0);
    }

    public static void functionA(int depth) {
        printlnDepth("A Start", depth);
        int x = 1 / 0;
        printlnDepth("A End", depth);
    }

    public static void functionB(int depth) {
        printlnDepth("B Start", depth);
        String item = List.of("1", "2", "3").get(100);
        printlnDepth("B End", depth);
    }

    public static void functionC(int depth) {
        printlnDepth("C Start", depth);
        Object o = null;
        boolean truth = o.equals("null");
        printlnDepth("C End", depth);
    }

    public static void functionD(int depth) {
        printlnDepth("D Start", depth);
        try {
            functionA(depth + 1);
        } catch (ArithmeticException e) {
            printlnDepth("D Arithmetic", depth + 1);
        } finally {
            printlnDepth("D Finally", depth + 1);
        }
        printlnDepth("D End", depth);
    }

    public static void functionE(int depth) {
        printlnDepth("E Start", depth);
        try {
            functionB(depth + 1);
        } catch (ArithmeticException e) {
            printlnDepth("E Arithmetic", depth + 1);
        } finally {
            printlnDepth("E Finally", depth + 1);
        }
        printlnDepth("E End", depth);
    }

    public static void functionF(int depth) {
        printlnDepth("F Start", depth);
        try {
            Stream<String> s = Stream.of("1", "2", "3");
            s.forEach(x -> printlnDepth(x, depth + 1));
            s.forEach(x -> printlnDepth(x, depth + 1));
        } catch (ArithmeticException e) {
            printlnDepth("F Arithmetic", depth + 1);
        } finally {
            printlnDepth("F Finally", depth + 1);
        }
        printlnDepth("F End", depth);
    }
}
