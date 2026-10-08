package maintenance;
public class TestPolymorphism {
    public static void main(String[] args) {
        User u1 = new Student(
                201,
                "Sinu",
                "sinu@gmail.com",
                "CSE"
        );
        User u2 = new Technician(
                301,
                "Ravi",
                "ravi@gmail.com",
                "Hardware"
        );
        System.out.println(u1.getName());
        System.out.println(u2.getName());
    }
}