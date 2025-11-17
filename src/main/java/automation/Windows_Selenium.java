package automation;

import java.util.Set;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Selenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		WebElement metaLink = driver.findElement(By.xpath("//span[text()='Meta']"));
		metaLink.click();
		
		WebElement aboutLink = driver.findElement(By.xpath("//span[text()='About']"));
		aboutLink.click();
		
		WebElement Blog = driver.findElement(By.xpath("//span[text()='Blog']"));
		Blog.click();
		
		Thread.sleep(5000);
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String temp: allwindows)
		{
			driver.switchTo().window(temp);
			Thread.sleep(5000);
			String tileOfWindow = driver.getTitle();
			System.out.println(tileOfWindow);			
		}
		
		driver.quit(); //It will close all the windows 	
		driver.close(); // it has closed only the Window on which the driver object was present
		
		

	}

}
