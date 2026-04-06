package Module1.Lecture3;

public class Conditionals {
    public static void main(String[] args) {
        if (100 > 200) {
            System.out.println(1);
        } else if (100 == 10 || 100 / 0 == 0) { // Short-circuit evaluation
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}
