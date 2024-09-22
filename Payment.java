import java.util.Date;
public class Payment {
    private int paymentId;
    private int reservationId;
    private int amount;
    private Date date;
    private String paymentMethod;

    public Payment(int paymentId, int reservationId, int amount, Date date, String paymentMethod) {
        this.paymentId = paymentId;
        this.reservationId = reservationId;
        this.amount = amount;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }

    public void processPayment() {
        // Implementation for processing payment
    }
}
