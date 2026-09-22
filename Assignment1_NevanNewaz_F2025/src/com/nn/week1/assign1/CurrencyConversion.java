package com.nn.week1.assign1;

import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class CurrencyConversion {
	
	public void conversion() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter currency in CAD: ");
			BigDecimal cad = sc.nextBigDecimal();
			
			BigDecimal cadToUsd = new BigDecimal("0.71");
			
			BigDecimal usd = cad.multiply(cadToUsd).setScale(2, RoundingMode.HALF_UP);
			
			System.out.println(usd);
		}
		catch (ArithmeticException e) {
			System.out.println("OOPS! Error found!");
		}
		
		
	
		
	}

}
