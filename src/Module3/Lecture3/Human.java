package Module3.Lecture3;

public class Human implements Carnivore, Herbivore {
    public void hunt() {
        IO.println(this + " hunts for food.");
    }

    public void gather() {
        IO.println(this + " farms food.");
    }

    public void program() {
        IO.println(this + " writes a java program.");
    }
}