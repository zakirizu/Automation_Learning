package automation;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.Before;

public class Waits_Selenium {
	
	WebDriver driver;
		
	@BeforeMethod
	public void CreateDriver() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void implicitWaitExample() throws InterruptedException {
		driver.get("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		
		driver.findElement(By.id("colorChange")).click();
		driver.findElement(By.id("visibleAfter")).click();		
		driver.quit();
	}
	
	@Test
	public void WithoutImpilictWait() throws InterruptedException {
		driver.get("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("colorChange")).click();
		Thread.sleep(20000);
		driver.findElement(By.id("visibleAfter")).click();		
		driver.quit();
	}
	

}
