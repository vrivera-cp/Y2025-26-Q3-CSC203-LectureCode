package Module5.Lecture2;

public class Cat {
    public String name;
    public int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /*
        Cat c = new Cat("Mochi", 5);
        c.meow(3) -> "Mochi says: meow meow meow"
        c.meow(4) -> "Mochi says: meow meow meow meow"
     */

    public String meow(int number) {
        String text = name + " says: ";

        for (int i = 0; i < number; i++) {
            text += "meow";
            if (i < number - 1) text += " ";
        }

        return text;
    }

    public static int humanAge(int catAge) {
        return catAge * 4;
    }
}
