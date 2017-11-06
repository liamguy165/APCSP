import java.util.Scanner;

public class physeng {
	double velocityInit;
	double time;
	double xDist;
	double yDist;
	double xacceleration;
	double yacceleration;
	String unknown;
	public void main(String[] args) {
		getInput();
	}
	public void getInput() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Program for calculating two-dimensional projectile motion-");
		System.out.println("Enter the following inputs as any real number and input '!' if it is unknown.");
		System.out.println("Initial velocity: ");
		if(reader.nextLine().equals("!")) {
			unknown = new String("velocityInit");
		}
		
	}
	
}
