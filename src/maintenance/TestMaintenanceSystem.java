package maintenance;

public class TestMaintenanceSystem {
    public static void main(String[] args) {

        MaintenanceSystem system = new MaintenanceSystem();

        User user = new User(101, "Sinu", "sinu@gmail.com");

        Technician technician =
                new Technician(301, "Ravi", "ravi@gmail.com", "Hardware");

        Issue issue1 = new Issue(
                1024,
                "PC #17 not booting",
                "CSE Lab 2",
                "HIGH",
                "OPEN",
                user,
                technician
        );

        Issue issue2 = new Issue(
                1025,
                "Projector not working",
                "CSE Lab 1",
                "MEDIUM",
                "OPEN",
                user,
                null
        );

        system.addIssue(issue1);
        system.addIssue(issue2);
        system.assignTechnician(1025, technician);
        system.updateStatus(1024, "IN PROGRESS");
        system.displayIssues();

        System.out.println("Total issues: " + system.getIssues().size());
        Issue found = system.findIssueById(1025);

        if (found != null) {
            System.out.println("Found: " + found.getDescription());
        } else {
            System.out.println("Issue not found.");
        }
    }
}