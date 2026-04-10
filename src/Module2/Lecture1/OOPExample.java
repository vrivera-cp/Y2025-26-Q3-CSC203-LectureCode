package Module2.Lecture1;

public class OOPExample {
    public static void main(String[] args) {
        Player player = new Player("Mochi");

        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 7; i++) {
            player.addToHand(deck.draw());
        }

        player.showHand();
    }
}
