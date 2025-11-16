package temp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Test {
	//Start off with the Set in java
	//Compare with List vs Set in java 
	//Talk about Quit and Close
	//Limiting the scope of Search on the webPage. 
	//Question Click on all the links in the footer of instagram page and print the title of each page.

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//footer[@role='contentinfo']//a//span[text()='Meta']")).click();
		driver.findElement(By.xpath("//footer[@role='contentinfo']//a//span[text()='About']")).click();
		driver.findElement(By.xpath("//footer[@role='contentinfo']//a//span[text()='Blog']")).click();
		driver.findElement(By.xpath("//footer[@role='contentinfo']//a//span[text()='Jobs']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String handle : windowHandles) {
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
		}
		
		driver.quit();
		
		
		
			
	}

}
