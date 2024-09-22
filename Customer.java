public class Customer extends User {
    private int driverLicense;
    private int paymentInfo;

    public Customer(int userId, String name, String email, String phoneNumber, int driverLicense, int paymentInfo) {
        super(userId, name, email, phoneNumber);
        this.driverLicense = driverLicense;
        this.paymentInfo = paymentInfo;
    }

    @Override
    public void login() {
        System.out.println(name + " logged in as Customer.");
    }

    @Override
    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void makeReservation() {
        // Implementation for making a reservation
    }

    public void cancelReservation() {
        // Implementation for canceling a reservation
    }

    public void updateReservation() {
        // Implementation for updating a reservation
    }
}
