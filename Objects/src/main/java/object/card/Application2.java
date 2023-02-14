package object.card;

import java.util.List;

public class Application2 {
    private final Cards cards;

    public Application2(Cards cards) {
        this.cards = cards;
    }

    public void Card() {
        List<Card> cards = this.cards.getCards();
    }
}
