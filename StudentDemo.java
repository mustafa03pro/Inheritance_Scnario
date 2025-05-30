package com.may28.multilevel;

import java.util.Scanner;



public class StudentDemo {

	public static void main(String[] args) {
		//System.out.println("hello");
     Scanner sc = new Scanner(System.in);
		
		int choice = Integer.parseInt(sc.nextLine());
        if(choice>=3){
            System.out.println("Invalid Choice!");
            System.exit(0);
        }
		switch (choice) {
		case 1:
        int roll= Integer.parseInt(sc.nextLine());
			String name = sc.nextLine();
			int physicsMarks = Integer.parseInt(sc.nextLine());
			int chemistryMarks = Integer.parseInt(sc.nextLine());
			int mathMarks = Integer.parseInt(sc.nextLine());

			SceinceStudent s1=new SceinceStudent(name, roll, physicsMarks, chemistryMarks, mathMarks);
			
			
			s1.displayDetails();
			s1.calculatePercentage();
			break;
		case 2:
			int roll1= Integer.parseInt(sc.nextLine());
			String name1 = sc.nextLine();
			int historyMarks = Integer.parseInt(sc.nextLine());
			int geographyMarks = Integer.parseInt(sc.nextLine());
			int englishMarks = Integer.parseInt(sc.nextLine());

			ArtsStudent a1=new ArtsStudent(name1, roll1, historyMarks, geographyMarks, englishMarks);
			
			
			a1.displayDetails();
			a1.calculatePercentage();
			break;
			
		

	}
		sc.close();

	}}
