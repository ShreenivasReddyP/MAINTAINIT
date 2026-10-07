package maintenance;

public class Technician extends User {
	private String specialization;
	public Technician(int userId, String name, String email, String specialization) {
	    super(userId, name, email);
	    this.specialization = specialization;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

}