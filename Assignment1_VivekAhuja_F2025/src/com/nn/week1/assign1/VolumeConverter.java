package com.nn.week1.assign1;

import java.util.Scanner;

public class VolumeConverter {
	
	static Scanner sc = new Scanner(System.in);
	
	static double toGals() {
		double liters, gallons = 0;
		System.out.print("Enter volume in liters: ");
		liters = sc.nextDouble();
		gallons = 0.26417205 * liters;
		return gallons;
	}
	
}
