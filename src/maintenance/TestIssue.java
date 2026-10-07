package maintenance;

public class TestIssue {
    public static void main(String[] args) {

        User user = new User(101, "Sinu", "sinu@gmail.com");

        Technician technician =
                new Technician(301, "Ravi", "ravi@gmail.com", "Hardware");

        Issue issue = new Issue(
                1024,
                "PC #17 not booting",
                "CSE Lab 2",
                "HIGH",
                "OPEN",
                user,
                technician
        );
        System.out.println(issue.getIssueId());
        System.out.println(issue.getDescription());
        System.out.println(issue.getLocation());
        System.out.println(issue.getPriority());
        System.out.println(issue.getStatus());

        System.out.println(issue.getReportedBy().getName());
        System.out.println(issue.getAssignedTo().getName());
    }
}