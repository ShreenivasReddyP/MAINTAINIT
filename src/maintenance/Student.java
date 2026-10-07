package maintenance;

public class Student extends User {
	private String branch;

	public Student(int userId, String name, String email, String branch) {
	    super(userId, name, email);
	    this.branch = branch;
	
    }

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
}