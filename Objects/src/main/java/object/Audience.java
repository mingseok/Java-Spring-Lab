package object;

// 관람객 -> 소지품을 보관하기 위한 클래스
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    // 인자로 전달된 Ticket을 Bag에 넣은 후 지불된 금액을 반환
    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
