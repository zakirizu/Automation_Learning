package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_Selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		
		//Swtich to the Frame 
		//driver.switchTo().frame("courses-iframe");
		WebElement ifrmaeElement = driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
		driver.switchTo().frame(ifrmaeElement);
		
		
		//Thread.sleep(5000);
		WebElement joinNowButton = driver.findElement(By.xpath("//a[text()='JOIN NOW']"));
		joinNowButton.click();
		
		//
		String parentWindow = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		for(String window : allHandles)
		{
			if(!(window.equals(parentWindow)))
			{
				driver.switchTo().window(window);
				driver.close();
			}
		}
		
		
		
		
		
		//Coming out of the frame
		//driver.switchTo().defaultContent();
				
		//Clicking on Radio Button1
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));
		radio1.click();
		
	}

}
