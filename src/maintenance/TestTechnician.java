package maintenance;

public class TestTechnician {
    public static void main(String[] args) {

        Technician t1 = new Technician(
            301,
            "Ravi",
            "ravi@gmail.com",
            "Hardware"
        );

        System.out.println(t1.getUserId());
        System.out.println(t1.getName());
        System.out.println(t1.getEmail());
        System.out.println(t1.getSpecialization());
    }
}