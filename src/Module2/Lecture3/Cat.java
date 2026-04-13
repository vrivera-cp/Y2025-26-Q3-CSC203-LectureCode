package Module2.Lecture3;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    @Override
    public boolean equals(Object other) {
        // 1. Check if the other thing is a Cat
        if (other instanceof Cat) {
            // 2. Type cast other to Cat
            Cat cat = (Cat) other;

            // 3. Return true if the instance's name is equal to the other's name
            //    && the instances age is equal to the other's age
            return this.age == cat.age
                    && (this.name == null ? cat.name == null : this.name.equals(cat.name));
        }
        return false;
    }

    @Override
    public int hashCode() {
        // Initial value
        int hash = 0;

        // Incorporate the hash code of each instance variable
        hash = hash * 31 + this.age;
        hash = hash * 31 + (this.name == null ? 0 : this.name.hashCode());

        // For other primitives, e.g., double, use Double.hashCode(value), etc.

        return hash;
    }

    public String getName() { return this.name; }
    public int getAge() { return this.age; }

    public void setName(String name) { this.name = name; }
}
