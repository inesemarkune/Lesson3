package com.lesson3;


//calculate a salary payment based on the working hours(standard hr, overtime hr)
public class Payment {
	
	//declare instance variables for the values to be calculated
	
	private double standardPay;
	private double overtimePay;
	private double totalPay;
	
	//declare a method with 3 params to calculate payment
	public void calculatePayment(double payRate, double standardHours, double overtimeHours){
		
		//calculate the overtime payment
		standardPay = payRate * standardHours;
		
		
		double overtimePayRate = payRate * 1.5;
		overtimePay = overtimePayRate * overtimeHours;
		
		totalPay = standardPay + overtimePay;
		
	}
	
	public void displayPayment(){
		System.out.println("The standard salary payment is: " + standardPay);
		System.out.println("The overtime salary payment is: " + overtimePay);
		System.out.println("The total salary payment is: " + totalPay);
	}
	 
	
	public static void main(String[] args) {
		
		//declare a variable of type of Payment (like the Class)
		Payment myPayment;
		
		//create an object of type of Payment
		myPayment = new Payment();
		
		
		double pR, sH, oH;
		
		pR = 20;
		sH = 40;
		oH = 20;
		
		myPayment.calculatePayment(pR, sH, oH);
		myPayment.displayPayment();
		
		myPayment.calculatePayment(19.5, 35, 12);
		myPayment.displayPayment();
	}//end main method

}//end class
