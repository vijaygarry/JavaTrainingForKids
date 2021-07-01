
public class StudentApp {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("Oreo");
		student1.setLastName("Garothaya");
		
		System.out.println("First name: " + student1.getFirstName());
		System.out.println("Last name: " + student1.getLastName());
	}
}
