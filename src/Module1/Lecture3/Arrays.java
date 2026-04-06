package Module1.Lecture3;

public class Arrays {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        String[] words = {"Hello", "Goodbye"};

        System.out.println(array[2]);

        array[2] = 999;

        System.out.println(array[2]);
        System.out.println(array.length);
    }
}
