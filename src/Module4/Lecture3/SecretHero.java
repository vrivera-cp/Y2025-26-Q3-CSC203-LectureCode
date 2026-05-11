package Module4.Lecture3;

public class SecretHero extends SuperHero {
    private String name;

    public SecretHero(String superHeroName, String power, String secretIdentity) {
        super(superHeroName, power);
        this.name = secretIdentity;
    }

    public String getName() {
        return name;
    }

    @Override
    public void doAction() {
        System.out.printf("%s does ordinary things.%n", name);
    }

    public void doSuperAction() {
        super.doAction();
    }

    public void doActionAsHero() {
        System.out.printf(
                "%s uses their %s.%n",
                super.getName(),
                getPower()
        );
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof SecretHero secretHero) {
            return super.equals(secretHero)
                    && (name == null ? secretHero.name == null : name.equals(secretHero.name));
        }
        return false;
    }
}
