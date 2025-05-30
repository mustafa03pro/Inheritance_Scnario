package com.may28.multilevel;

public class Student {
	protected String name;
	protected int rollNumber;
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public void displayDetails() {
		System.out.println("Student [name=" + name + ", rollNumber=" + rollNumber + "]");
		
	}
	public double calculatePercentage() {
		
		return 0;
	}
	

}
class SceinceStudent extends  Student{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	public SceinceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		if(rollNumber<0||chemistryMarks<0||mathMarks<0||physicsMarks<0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	
	}
	public void displayDetails() {
		System.out.println("SceinceStudent name=" + name + "\nrollNumber=" + rollNumber + "\nphysicsMarks=" + physicsMarks
				+ "\nchemistryMarks=" + chemistryMarks + "\nmathMarks=" + mathMarks );
		
	}
	
	@Override

	public double calculatePercentage() {
		double total=(physicsMarks+chemistryMarks+mathMarks)/3;
		if(total>90) {
			System.out.println("Percentage:"+total);
		}
		else if(total<90&&total>75) {
			System.out.println("Percentage:"+total);
			
		}
		else if(total<75&&total>50) {
			System.out.println("Percentage:"+total);
		}
		else {
			System.out.println("Percentage:"+total);
		}
		return total;
	}
	
	
	
}
class ArtsStudent extends  Student{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		if(rollNumber<0||historyMarks<0||geographyMarks<0||englishMarks<0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
		
	}

	public void displayDetails() {
		System.out.println("ArtsStudent name=" + name + "\n rollNumber=" + rollNumber + "\n historyMarks=" + historyMarks
				+ "\n geographyMarks=" + geographyMarks + "\n englishMarks=" + englishMarks );
		
	}

	public double calculatePercentage() {
		double total=(geographyMarks+englishMarks+historyMarks)/3;
		if(total>90) {
			System.out.println("Percentage:"+total);
		}
		else if(total<90&&total>75) {
			System.out.println("Percentage:"+total);
			
		}
		else if(total<75&&total>50) {
			System.out.println("Percentage:"+total);
		}
		else {
			System.out.println("Percentage:"+total);
		}
		return total;
	}
	
	
}
