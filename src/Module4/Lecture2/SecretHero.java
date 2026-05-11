package Module4.Lecture2;

public class SecretHero extends SuperHero {
    private String name;

    public SecretHero(String parentName, String power, String name) {
        super(parentName, power);
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
