package Module3.Lecture3;

public class TypeCastMain {
    public static void main(String[] args) {
        // Instantiation
        Human human1 = new Human();
        Lion lion1 = new Lion();
        Tortoise tortoise1 = new Tortoise();

        // Up Cast
        Carnivore carnivore1 = (Carnivore) lion1;

        // Class to Unrelated Class
        // Lion lion2 = (Lion) human1;

        // Down Cast
        Herbivore herbivore1 = human1;
        Human human2 = (Human) herbivore1;

        // To unrelated interface
        // Carnivore carnivore2 = (Carnivore) tortoise1;

        // Method Access
        human1.program();
        Herbivore herbivore3 = human1;
        ((Human) herbivore3).program();
        ((Carnivore) herbivore3).hunt();
    }
}
