package object.card;

import java.util.ArrayList;
import java.util.List;

public class CardStore {
    public List<Card> cards(int money) {
        List<Card> cards = new ArrayList<>();

        for (int i = 0; i < money; i++) {
            cards.add(new Card("dvv", i));
        }
        return cards;
    }
}
