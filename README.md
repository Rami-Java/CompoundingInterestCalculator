# CompoundingInterestCalculator
Compounding Interest Calculator


Assignment #1
 

Requirements

For this assignment your goal is to create a simple Java console application that will calculate compound interest based on two inputs:
 


	
 The initial investment (any valid double value between 0.0 and 1000000.0)
	 The yearly interest rate (a double value between 0.0 and 1.0)

 

Your program should ask the user to type these two variables into the console using the Scanner object.

Once you've collected the "initial investment" value as well as the "yearly interest rate" value, you'll need to calculate the compounding interest and show what their total amount will be every 5 years for the next 30 years. See the "Example Output" section below for clarification.

In order to calculate compounding interest, you'll need to use this formula:

initial investment = initial investment * (yearly interest rate + 1.0)

This formula will give you 1 year of growth. So in order to see what growth looks like after 5 years, you'll need to keep executing that formula 5 times.

For bonus marks, you can:
 


	
include data validation to ensure that the inputs are valid double values inside of the ranges.
	allow the user to enter the interest rate as a number between 0.0 and 100.0, which mean's you'd then need to modify the input value to work properly with the compound interest formula

 

Example Output


Type in your starting investment: 

15000

Type in your interest rate: 

0.07

After 5 years, you would have: 21038

After 10 years, you would have: 29507

After 15 years, you would have: 41385

After 20 years, you would have: 58045

After 25 years, you would have: 81411

After 30 years, you would have: 114184


 
Type in your starting investment: 

900000.50

Type in your interest rate: 

0.05

After 5 years, you would have: 1148654

After 10 years, you would have: 1466006

After 15 years, you would have: 1871036

After 20 years, you would have: 2387969

After 25 years, you would have: 3047721

After 30 years, you would have: 3889750


