package yet_To_Teach;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IFrames_Selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Switch to iframe using id
		driver.switchTo().frame("courses-iframe");
		
		// Click on JOIN NOW button inside the iframe		
		WebElement joinCourse = driver.findElement(By.xpath("//a[text()='JOIN NOW']"));
		joinCourse.click();
		
		// Switch back to the main content
		driver.switchTo().defaultContent();
		
		
		//Trying to click on radio button present in main page
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='radio1']"));
		radioButton.click();
		
	
		

	}

}
