package maintenance;

public class TestUser {
    public static void main(String[] args) {

    	Student s1 = new Student(201, "Sinu", "sinu@gmail.com", "CSE");

        System.out.println(s1.getUserId());
        System.out.println(s1.getName());
        System.out.println(s1.getEmail());
        System.out.println(s1.getBranch());
    }
}