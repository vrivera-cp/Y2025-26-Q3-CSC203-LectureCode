package Module2.Lecture3;

public class CatEqualityMain {
    public static void main(String[] args) {
        Cat catA = new Cat(null, 10);
        Cat catB = new Cat("Harvest", 9);
        Cat catC = new Cat(null, 10);

        System.out.println(catA.equals(catA));
        System.out.println(catA.equals(catB));
        System.out.println(catA.equals(catC));
    }
}
