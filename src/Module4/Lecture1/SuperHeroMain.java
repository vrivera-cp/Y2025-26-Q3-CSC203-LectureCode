package Module4.Lecture1;

public class SuperHeroMain {
    public static void main(String[] args) {
        SecretHero secretHero = new SecretHero();

        secretHero.name = "Clark Kent";
        secretHero.power = "Flight";

        // Instance variable access prefers the STATIC type of the reference variable
        ((SuperHero) secretHero).name = "Superman";

        IO.println(secretHero.name);
        IO.println(secretHero.power);
        IO.println(((SuperHero) secretHero).name);


        // Accessing parent value using aliasing
        SuperHero upCastedSecretHero = secretHero; // Up Cast
        IO.println(upCastedSecretHero.name);
    }
}
