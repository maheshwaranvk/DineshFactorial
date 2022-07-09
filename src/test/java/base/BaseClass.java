package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	@BeforeClass
	public void launchBrowser() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://qainterview.pythonanywhere.com/");

	}
	
	public void clickCalculate() throws InterruptedException{
		driver.findElement(By.id("getFactorial")).click();
		Thread.sleep(3000);

	}
	
	public void checkOutput(String expResult) {
		String text = driver.findElement(By.id("resultDiv")).getText();
		Assert.assertTrue(text.endsWith(expResult));
	}
	
	public void calculateFactorial(String input, String output) throws InterruptedException {
		driver.findElement(By.id("number")).sendKeys(input);
		clickCalculate();
		checkOutput(output);
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();

	}

	


}
