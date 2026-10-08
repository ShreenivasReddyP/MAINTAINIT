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
            System.out.println("Reported By: " + issue.getReportedBy().getName());
            if (issue.getAssignedTo() != null) {
                System.out.println("Assigned Technician: "
                        + issue.getAssignedTo().getName());
            } else {
                System.out.println("Assigned Technician: None");
            }
            System.out.println("----------------------");
        }
    }
    public void updateStatus(int issueId, Status newStatus) {
        for (Issue issue : issues) {
            if (issue.getIssueId() == issueId) {

                Status currentStatus = issue.getStatus();

                if (currentStatus == Status.OPEN && newStatus == Status.ASSIGNED
                        || currentStatus == Status.ASSIGNED && newStatus == Status.IN_PROGRESS
                        || currentStatus == Status.IN_PROGRESS && newStatus == Status.RESOLVED
                        || currentStatus == Status.RESOLVED && newStatus == Status.CLOSED) {

                    issue.setStatus(newStatus);
                    System.out.println("Status updated successfully.");

                } else {
                    System.out.println("Invalid status transition.");
                }

                return;
            }
        }

        System.out.println("Issue not found.");
    }
    public void assignTechnician(int issueId, Technician technician) {
        for (Issue issue : issues) {
            if (issue.getIssueId() == issueId) {
                issue.setAssignedTo(technician);
                issue.setStatus(Status.ASSIGNED);
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
    public void removeIssue(int issueId) {

        for (int i = 0; i < issues.size(); i++) {

            if (issues.get(i).getIssueId() == issueId) {
                issues.remove(i);
                System.out.println("Issue removed successfully.");
                return;
            }
        }

        System.out.println("Issue not found.");
    }
}