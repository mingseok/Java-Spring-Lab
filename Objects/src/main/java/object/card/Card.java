package object.card;

public class Card {
    private final String mark;
    private final int number;

    public Card(String mark, int number) {
        this.mark = mark;
        this.number = number;
    }

    @Override
    public String toString() {
        return "mark=" + mark + ", number=" + number;
    }
}
