package com.coderscampus.objects;

public class Calculator {
 
	double initInvestment;
    double yIntrstRate;
    int y;

	
// calculate compound interest after y number of years
 void calInterest (int year, double initialInvestment, double yearlyInterestRate) 
   {
	 initInvestment = initialInvestment;
	 yIntrstRate = yearlyInterestRate;
	 y = year;
	
	 	for (int i=0 ;i<y ;i++) 
		 {
	 	 initialInvestment = initialInvestment * (yearlyInterestRate + 1.0);
			
		 	if (i==(y-1)) 
		 	 {
		 		int intInitialInvestment = (int) initialInvestment;
		 	System.out.println("After "+y+" years, you would have: " + 
		 		intInitialInvestment);
		 	
		 	 }
		 }
	 }
 }
