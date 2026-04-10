package Module2.Lecture1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Player {
    private String name;
    private Set<Card> hand = new HashSet<>();

    public Player(String name) {
        this.name = name;
    }

    public void addToHand(Card card) {
        hand.add(card);
    }

    public void showHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
