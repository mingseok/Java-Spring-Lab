package object.ticket;

/**
 * 소지품을 보관할 클래스.
 * 이벤트 당첨자는 티켓으로 교환할 초대장을 가지고 있다.
 * 이벤트 당첨되지 않은 관람객은 티켓을 구매할 수 있는 현금을 보유하고 있다.
 * 따라서, 관람객이 가지고 올 수 있는 소지품은 초대장, 현금, 티켓 세가지 뿐이므로,
 * 관람객은 소지품을 보관할 용도로 가방을 들고 올수 있다고 가정하자.
 */
public class Bag {
    private Long amount; // 돈
    private Invitation invitation; // 초대장
    private Ticket ticket; // 티켓

    // 초대장 없이 현금만 보관한다.
    public Bag(long amount) {
        this(null, amount);
    }

    // 현금과 초대장을 함께 보관한다.
    public Bag(Invitation invitation, long amount) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    // 초대장의 보유 여부를 판단하는 메서드
    private boolean hasInvitation() {
        return invitation != null;
    }

    // 초대장을 티켓으로 교환하는 메서드
    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // 현금을 감소 메서드
    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}