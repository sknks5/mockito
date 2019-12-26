package com.exercises.mockitotest.mockito;

public class MathCalculator {
	
	private CalculateService calculateService;
	
	public MathCalculator(CalculateService calculateService){
		this.calculateService = calculateService;
	}
	
	public double addNumbers(double a, double b){
		System.out.println("ready to add numbers a = " + a + " b = " + b);
		if (a < 0 || b < 0)
			System.out.println("One of the number is negative, just so you know");
		else
			System.out.println("Positive numbers provided");
		
		this.takeABreak();
		return calculateService.add(a, b);
	}
	
	public double multiplyNumbers(double a, double b){
		System.out.println("ready to multiply numbers a = " + a + " b = " + b);
		this.takeABreak();
		return calculateService.multiply(a, b);
	}
	
	public void takeABreak(){
		System.out.println("take a short break");
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
