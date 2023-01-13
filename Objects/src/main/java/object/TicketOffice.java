package object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 매표소에는 관람객에게 판매할 티켓과 티켓의 판매 금액이 보관돼 있다.
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // 티켓 받기
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    // 마이너스 금액
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 플러스 금액
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
