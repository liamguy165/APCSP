package gpaCalculator;
import java.util.Scanner;
public class gpaCalc  {
	Scanner reader = new Scanner(System.in);
	double totalGPA;
	static double gpa;
	public static void main(String[] args) {
	gpaCalc gpa1 = new gpaCalc();
	gpa1.main1();
	System.out.println("Your GPA is: " + (gpa));
	}
	public void main1() {
		for(int i = 0;i<7;i++) {	
			System.out.println("Type your letter grade for a class with or without a plus or minus: ");
			String a = reader.nextLine();
			System.out.println("Type what type of class, either AP, Honors, or Regular: ");
			String b = reader.nextLine();
			classGPA c = new classGPA(a, b);
			totalGPA += c.getGPA();
		}
		gpa = totalGPA / 7;
	}
}
