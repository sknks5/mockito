package com.exercises.mockitotest.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;				
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathCalculatorTest {
	
	
	@Mock
	CalculateService calculateService;
	
	@Test
	public void testAdd(){		
		
		when(calculateService.add(10.0, 20.0)).thenReturn(30.0);
		when(calculateService.multiply(10.0, 20.0)).thenReturn(200.0);
		MathCalculator mathCalculator = new MathCalculator(calculateService);
		double sum = mathCalculator.addNumbers(10.0, 20.0);
		double product = mathCalculator.multiplyNumbers(10.0, 20.0);
		
		
        assertEquals(sum,30.0, 0);
        assertEquals(product,200.0, 0);
        System.out.println("Test Complete");
	}

}
