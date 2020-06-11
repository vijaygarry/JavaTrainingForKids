import java.util.Scanner;

public class ReadExample {
	public static void main(String[] args) {
		
		
		String name = readUserStringInput("Enter your name:");
		String lastName = readUserStringInput("Enter your last name:");
		System.out.print( "Your full name: " + name + " " + lastName + " :)");
		
		
		int num1 = readUserIntInput("Enter num1:");
		int num2 = readUserIntInput("Enter num2:");
		int sum = num1 + num2;
		System.out.println( "Sum " + sum );
	}
	
	
	public static String readUserStringInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	
	
	public static int readUserIntInput (String aInputMsg) {
		System.out.print( aInputMsg + " ");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}
