package object;

/**
 * 극장(메인)을 구현하는 클래스이다.
 *
 * (동작 설명)
 * 1. 먼저, 관람객의 가방 안에 초대장이 들어 있는지 확인한다.
 * 2. 만약 초대장이 들어 있다면 이벤트에 당첨된 관람객이므로 판매원에게서 받은 티켓을
 * 3. 관람객의 가방 안에 넣어준다. 가방 안에 초대장이 없다면 티켓을 판매해야 한다.
 * 4. 그럴 경우, 극장은 관람객의 가방에서 티켓 금액만큼을 차감한 후 매표소에 금액을 증가 시킨다.
 * 5. 마지막으로 소극장은 관람객의 가방 안에 티켓을 넣어줌으로써 관람객의 입장 절차를 끝낸다.
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {

    }
}
