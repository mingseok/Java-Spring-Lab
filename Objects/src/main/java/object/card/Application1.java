package object.card;


import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        CardStore cardStore = new CardStore();
        List<Card> cards1 = cardStore.cards(5);
        System.out.println(cards1);

        Cards cards = new Cards(cards1);
        Application2 application2 = new Application2(cards);
    }
}
