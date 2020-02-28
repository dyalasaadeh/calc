package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.calculator;
import junit.framework.Assert;

public class TEST {

	class testcase {
		@Test
		public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 20;
		calculator calc = new calculator();
		// Act
		int result = calc.add(a, b);
		// Assert
		Assert.assertTrue(result > 0);}
		
		
		@Test
		public void testSum_BothNumbersAreNegative_ShouldReturnNegativeNumber() {
		// Arrange
		int a = -10;
		int b = -20;
		calculator calc = new calculator();
		// Act
		int result = calc.add(a, b);
		// Assert
		Assert.assertTrue(result < 0);
		
		}
		
		@Test
		public void testSum_BothNumbersAreEqualAndOpositeSign_ShouldReturnzero() {
		// Arrange
		int a = -10;
		int b = 10;
		calculator calc = new calculator();
		// Act
		int result = calc.add(a, b);
		// Assert
		Assert.assertTrue(result == 0);
		
		}

	}


}
