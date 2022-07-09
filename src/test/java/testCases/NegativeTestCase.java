package testCases;

import org.testng.annotations.Test;

import base.BaseClass;

public class NegativeTestCase extends BaseClass{
	
	//NegativeTestCase
		@Test
		public void stringInput() throws InterruptedException {
			calculateFactorial("Dinesh", "integer");

		}

}
