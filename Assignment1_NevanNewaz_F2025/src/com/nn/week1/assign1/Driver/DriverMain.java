package com.nn.week1.assign1.Driver;

import java.util.Scanner;
import com.nn.week1.assign1.*;

public class DriverMain {

	public static void main(String[] args) {
		

	/*
	 * Create objects for classes of Task a-d.	
	 * 
	 * 
	 */
		
	// for example tasks grade calculation goes as below..
		GradeCalculation gc = new GradeCalculation();
		CurrencyConversion cc = new CurrencyConversion();
// create objects for all the classes..  and then call the method using switch case.. 

	System.out.println("Enter the choice for operation  1.-GradeCacluation, 2-DistanceConverter, 3-VolumeConverter, 4-CurrencyConversion");
	try (Scanner sc = new Scanner(System.in)) {
		int choice=sc.nextInt();
		
		
		    switch (choice) {
		      case 1: //Task A
		    	  	System.out.println("Doing Grade Calculation...");
			      	gc.GradeCalc();
			        break;
		      case 2: //Task B
			        System.out.println("Doing Distance Conversion...");
			        // call using object.method to initialize the method...
			        System.out.println(DistanceConverter.toKms());
			        break;
		      case 3: //Task C
		    	  System.out.println("Doing Volume Conversion...");
		    	  System.out.println(VolumeConverter.toGals());
		    	  break;
		      case 4: //Task D
		    	  System.out.println("Doing Currency Conversion...");
		    	  cc.conversion();
		    	  break;
		    	  default:
		    		  System.out.println("No operations have been performed.");
		    		  
		    		  
		    }
	}
		
		
		
	
		
	}

}
