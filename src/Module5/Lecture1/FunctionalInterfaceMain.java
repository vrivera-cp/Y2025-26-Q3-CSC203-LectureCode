package Module5.Lecture1;


public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        // (x, y) : Parameter Names
        // ->
        // x * y : return value
        IntOp intOp = (x, y) -> {
            int z = x + y;
            return z;
        };
        IO.println(intOp.operate(10, 10));
    }
}
