package Module2.Lecture3;

public class CatMain {
    public static void main(String[] args) {
        Cat cat = new Cat("Mochi", 10);

        System.out.println("this is a string: " + cat);

        Object object = cat;
        System.out.println(object);
    }
}
