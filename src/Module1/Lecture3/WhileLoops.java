package Module1.Lecture3;

public class WhileLoops {
    public static void main(String[] args) {
        int x = 0;
        while (x < 3) {
            System.out.print(x);
            x++; // x = x + 1
        }
        System.out.println();

        do {
            System.out.printf("%d", x);
            x--; // x = x - 1
        } while (x > 0);
        System.out.printf("%n");
    }
}
