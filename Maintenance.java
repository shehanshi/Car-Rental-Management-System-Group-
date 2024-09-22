import java.util.Date;
public class Maintenance {
    private int maintenanceId;
    private int carId;
    private Date date;
    private String details;
    private String status;

    public Maintenance(int maintenanceId, int carId, Date date, String details, String status) {
        this.maintenanceId = maintenanceId;
        this.carId = carId;
        this.date = date;
        this.details = details;
        this.status = status;
    }

    public void performMaintenance() {
        // Implementation for performing maintenance
    }
}
