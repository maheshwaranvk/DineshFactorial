package testCases;

import org.testng.annotations.Test;

import base.BaseClass;

public class EdgeTestCase extends BaseClass {
	
	//EdgeTestCase
		@Test
		public void highestIntegerNumber() throws InterruptedException {
			calculateFactorial("2147483647", "error");

		}

}
