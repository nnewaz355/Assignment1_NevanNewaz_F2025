package com.nn.week1.assign1;

import java.util.Scanner;

public class DistanceConverter {
	static Scanner sc = new Scanner(System.in);
	
	public static double toKms() {
		double miles, kilometers = 0;
		System.out.print("Enter distance in Miles: ");
		miles = sc.nextDouble();
		kilometers = 1.60934 * miles;
		return kilometers;
	}
}
