package com.exercises.mockitotest.mockito;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunMathCalculatorTest {
	
	public static void main(String[] args){
		System.out.println("I am ready to Run some tests!!!!");
		Result result = JUnitCore.runClasses(MathCalculatorTest.class);
		for (Failure failure: result.getFailures()){
			System.out.println(failure.toString());
		}
	}

}
