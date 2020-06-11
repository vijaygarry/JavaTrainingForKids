import java.util.Scanner;

public class ReadExample {
	public static void main(String[] args) {
		
		System.out.print( "Enter your name: ");
		String name = readUserStringInput();
		System.out.print( "Enter your last name: ");
		String lastName = readUserStringInput();
		
		
		System.out.print( "Your full name: " + name + " " + lastName + " :)");
		System.out.print( "Enter num1: ");
		int num1 = readUserIntInput();
		System.out.print( "Enter num2: ");
		int num2 = readUserIntInput();
		int sum = num1 + num2;
		System.out.println( "Sum " + sum );
	}
	
	public static String readUserStringInput () {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	
	public static int readUserIntInput () {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
}
