package Module2.Lecture1;

import java.util.LinkedList;

public class Cat {
    public String name = "Stray";
    public int age;

    // Default Constructor, given if no other constructor is defined
    // public Cat() {}

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overload
    public Cat(int age) {
        this.age = age;
    }
}
