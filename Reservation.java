import java.util.Date;
public class Reservation {
    private int reservationId;
    private int customerId;
    private int carId;
    private Date startDate;
    private Date endDate;
    private String status;

    public Reservation(int reservationId, int customerId, int carId, Date startDate, Date endDate, String status) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.carId = carId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public void createReservation() {
        // Implementation for creating a reservation
    }

    public void cancelReservation() {
        // Implementation for canceling a reservation
    }

    public void updateReservation() {
        // Implementation for updating a reservation
    }
}
