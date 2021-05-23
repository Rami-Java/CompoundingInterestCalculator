package com.coderscampus.objects;
import java.util.Scanner;


public class CalculatorRunnableClass 
{
	 
	// Declare the Scanner variable as a class (static) field. 
	// https://coderanch.com/wiki/678613/Don-close-Scanner-tied-System 
	// create once, use everywhere without closing
	private static final Scanner keyboard = new Scanner(System.in);
	    
 public static void main(String[] args) 
 {
	 double initialInvestment;
	 double yearlyInterestRate;
	 	    
// print out Input Criteria: "any valid double value between 0.0 and 1000000.0"
 System.out.println("Type in your Starting Investment: (The value Must be between 0.0 and 1000000.0)");

// get "Starting Investment" value
	 initialInvestment = keyboard.nextDouble();

// validate Input: "Starting Investment"
	while (initialInvestment <= 0.0 || initialInvestment >= 1000000.0) {
	System.out.println("The value of Starting Investment Must be between 0.0 and 1000000.0: ");
	initialInvestment = keyboard.nextDouble();
				       }       
					  	
// print out Input Criteria in console: "a double value between 0.0 and 1.0"
	System.out.println("Type in your Interest Rate: (The value Must be between 0.0 and 1.0)");

// get  "Interest Rate" value
 yearlyInterestRate = keyboard.nextDouble();	

// validate Input: "Interest Rate"
	while (yearlyInterestRate <= 0.0 || yearlyInterestRate >= 1.0)
		{System.out.println("The value of Interest Rate Must be between 0.0 and 1.0");
		yearlyInterestRate = keyboard.nextDouble();
					    }
//calculate compound interest every 5 years for 30 years			
    Calculator yearsInterest = new Calculator();
    int year=0;
   for (int i=0; i<=5; i++) {
	yearsInterest.calInterest( year=year+5,  initialInvestment,  yearlyInterestRate );
   }
 }
}
	