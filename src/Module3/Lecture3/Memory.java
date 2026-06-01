package Module3.Lecture3;

public class Memory {
    public static void main(String[] args) {
        double x = 100.0;
        int y = (int) x;

        x++;

        System.out.println(x);
        System.out.println(y);

        Cat cat = new Cat("Mochi", 10);
        Object object = (Object) cat;

        cat.celebrateBirthday();

        System.out.println(cat.getAge());

        System.out.println(cat);
        System.out.println(object);

    }
}
