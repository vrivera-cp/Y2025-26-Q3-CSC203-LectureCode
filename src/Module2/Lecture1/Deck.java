package Module2.Lecture1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (int rank = 2; rank <= Card.ACE; rank++) {
            for (String suit : List.of("♠️", "♥️", "♦️", "♣️")) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) {
            return null;
        } else {
            return cards.removeFirst();
        }
    }
}
