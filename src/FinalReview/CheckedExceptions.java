package FinalReview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptions {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("nonexistent"));

            while (scanner.hasNextLine()) {
                IO.println(scanner.next());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            IO.println("File Not found!");
        }
    }
}
