package Module4.Lecture2;

public class HeroMain {
    public static void main(String[] args) {
        SecretHero secretHero = new SecretHero(
                "Superman",
                "flight",
                "Clark Kent"
        );

        IO.println(secretHero.getName());
        IO.println(((SuperHero) secretHero).getName());
        secretHero.doAction();
    }
}
