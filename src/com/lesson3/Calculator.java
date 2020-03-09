package com.lesson3;


//perform a simple calculation using methods
public class Calculator {

		private double result;
		
		public void add(double numberOne, double numberTwo){
			
			result = numberOne + numberTwo;
			System.out.println(numberOne + " + " + numberTwo + " = " + result);
		}
		
		public void subtract(double numberOne, double numberTwo){
			
			result = numberOne - numberTwo;
			System.out.println(numberOne + " - " + numberTwo + " = " + result);
		}
		
		public void multiply(double numberOne, double numberTwo){
			
			result = numberOne * numberTwo;
			System.out.println(numberOne + " * " + numberTwo + " = " + result);
		}
		
		
		public void divide(double numberOne, double numberTwo){
			
			result = numberOne / numberTwo;
			System.out.println(numberOne + " / " + numberTwo + " = " + result);
		}
		
		
		public static void main(String[] args) {
			
			
			//reuse the Calculator class
			//declare a variable of type of Calculator
			Calculator myCalc = new Calculator();
			myCalc.add(50, 20);
			myCalc.subtract(60, 45);
			myCalc.multiply(30, 15);
			myCalc.divide(80, 20);
			
			
	}

}
