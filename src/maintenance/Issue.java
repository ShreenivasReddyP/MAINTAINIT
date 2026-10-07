package maintenance;

public class Issue {
    private int issueId;
    private String description;
    private String location;
    private String priority;
    private String status;
    private User reportedBy;
    private Technician assignedTo;
    public Issue(int issueId, String description, String location,
            String priority, String status, User reportedBy,
            Technician assignedTo) {

   this.issueId = issueId;
   this.description = description;
   this.location = location;
   this.priority = priority;
   this.status = status;
   this.reportedBy = reportedBy;
   this.assignedTo = assignedTo;
}
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getReportedBy() {
	    return reportedBy;
	}

	public Technician getAssignedTo() {
	    return assignedTo;
	}
	public void setAssignedTo(Technician assignedTo) {
	    this.assignedTo = assignedTo;
	}
}