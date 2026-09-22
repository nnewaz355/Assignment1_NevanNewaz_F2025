package com.nn.week1.assign1;

import java.util.Scanner;

public class GradeCalculation {

	public void GradeCalc() {
		
	/*
	 * Logic for grade calculation...	
	 */
		
		int marks[] = new int[6];
		int i;
		float total = 0, avg;

		try (Scanner scanner = new Scanner(System.in)) {
			boolean valid = false;
			for (i = 0; i < 6; i++) {
				valid = false;
				while (!valid) {
					System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
					marks[i] = scanner.nextInt();
					if (marks[i] >= 0 && marks[i] <= 100) {
						total = total + marks[i];
						valid = true;
					} else {
						System.out.println("Grade must be between 0 and 100.");
					}
				}
			}
			scanner.close();
		}

		// Calculating average here
		avg = total / 6;
		
		/*
		 * modify this as per your outline... 
		 */

		System.out.print("The student Grade is: ");
		if (avg >= 80) {
			System.out.print("A");
		} else if (avg >= 70 && avg < 80) {
			System.out.print("B");
		}
		//..  complete this... as outline ... specification.. 

		else if (avg >= 60 && avg < 70) {
			System.out.print("C");
		}

		else if (avg >= 50 && avg < 60) {
			System.out.print("D");
		}
		else if (avg < 50) {
			System.out.print("F");
		}


		
	}
	
}
