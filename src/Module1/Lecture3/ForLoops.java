package Module1.Lecture3;

import java.util.ArrayList;
import java.util.List;

public class ForLoops {
    public static void main(String[] args) {
        int[] values = {1, 2, 3};

        // Enhanced For Loop
        for (int x : values) {
            System.out.print(x);
        }
        System.out.println();

        String word = "Mochi";

        // Traditional For Loop
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
        }
        System.out.println();


        List<Integer> items = new ArrayList<>();
    }
}
