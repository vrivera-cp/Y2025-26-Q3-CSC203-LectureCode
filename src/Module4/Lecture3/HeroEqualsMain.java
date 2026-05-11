package Module4.Lecture3;

public class HeroEqualsMain {
    public static void main(String[] args) {
        SecretHero secretHero = new SecretHero(
                "Superman",
                "Flight",
                "Clark Kent"
        );
        SecretHero clone = new SecretHero(
                "Superman",
                "Flight",
                "Clark Kent"
        );

        IO.println(secretHero.equals(clone));

        SuperHero superHero = new SuperHero(
                "Superman",
                "Flight"
        );

        IO.println(secretHero.equals(superHero));
        IO.println(superHero.equals(secretHero));
    }
}
