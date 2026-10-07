package maintenance;

import java.util.ArrayList;

public class MaintenanceSystem {

    private ArrayList<Issue> issues = new ArrayList<>();

    public void addIssue(Issue issue) {
        issues.add(issue);
    }

    public ArrayList<Issue> getIssues() {
        return issues;
    }
    public void displayIssues() {
        for (Issue issue : issues) {
            System.out.println("Issue ID: " + issue.getIssueId());
            System.out.println("Description: " + issue.getDescription());
            System.out.println("Location: " + issue.getLocation());
            System.out.println("Priority: " + issue.getPriority());
            System.out.println("Status: " + issue.getStatus());
            if (issue.getAssignedTo() != null) {
                System.out.println("Assigned Technician: "
                        + issue.getAssignedTo().getName());
            } else {
                System.out.println("Assigned Technician: None");
            }
            System.out.println("----------------------");
        }
    }
    public void updateStatus(int issueId, String newStatus) {
        for (Issue issue : issues) {
            if (issue.getIssueId() == issueId) {
                issue.setStatus(newStatus);
                System.out.println("Status updated successfully.");
                return;
            }
        }

        System.out.println("Issue not found.");
    }
    public void assignTechnician(int issueId, Technician technician) {
        for (Issue issue : issues) {
            if (issue.getIssueId() == issueId) {
                issue.setAssignedTo(technician);
                System.out.println("Technician assigned successfully.");
                return;
            }
        }

        System.out.println("Issue not found.");
    }
    public Issue findIssueById(int issueId) {

        for (Issue issue : issues) {

            if (issue.getIssueId() == issueId) {
                return issue;
            }
        }

        return null;
    }
}