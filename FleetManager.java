public class FleetManager extends User {
    private int employeeId;

    public FleetManager(int userId, String name, String email, String phoneNumber, int employeeId) {
        super(userId, name, email, phoneNumber);
        this.employeeId = employeeId;
    }

    @Override
    public void login() {
        System.out.println(name + " logged in as Fleet Manager.");
    }

    @Override
    public void logout() {
        System.out.println(name + " logged out.");
    }

    public void manageFleet() {
        // Implementation for managing fleet
    }

    public void generateReport() {
        // Implementation for generating report
    }
}
