package Module1.Lecture3;

public class Strings {
    public static void main(String[] args) {
        String text = "Hello"; // Reference variable
        String textNew = new String("Hello"); // Copy

        System.out.println(text == textNew); // Compares referencs
        System.out.println(text.equals(textNew)); // Compares data
    }
}
