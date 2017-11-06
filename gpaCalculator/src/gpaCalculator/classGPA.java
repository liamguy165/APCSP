package gpaCalculator;

public class classGPA {
	private String grade;
	private String level;
	private double weight;
	public classGPA(String sgrade, String slevel) {
		grade = sgrade;
		level = slevel;
		if(level.equals("AP") || level.equals("ap")) {
			weight = 1.0;
		}
		else if(level.equals("Honors") || level.equals("honors")) {
			weight = 0.5;
		}
		else {
			weight = 0.0;
		}
	}
	
	public double getGPA() {
		double p1;
		if(grade.equals("A+") || grade.equals("A")) {
			 p1 = 4.0;
		}
		else if(grade.equals("A-")) {
			p1 = 3.7;
		}
		else if(grade.equals("B+")) {
			p1 = 3.3;
		}
		else if(grade.equals("B")) {
			p1 = 3.0;
		}
		else if(grade.equals("B-")){
			p1 = 2.7;
		}
		else if(grade.equals("C+")) {
			p1 = 2.3;
		}
		else if(grade.equals("C")) {
			p1 = 2.0;
		}
		else if(grade.equals("C-")) {
			p1 = 1.7;
		}
		else if(grade.equals("D+")) {
			p1 = 1.3;
		}
		else if(grade.equals("D")) {
			p1 = 1.0;
		}
		else {
			p1 = 0.0;
		}
		return p1+weight;
		
		
				
	}
}
