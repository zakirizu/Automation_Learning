package temp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//footer[@role='contentinfo']//a"));
		
		for(int i=0; i<links.size(); i++) {
			WebElement link = links.get(i);
			link.click();	
			Thread.sleep(2000);
		}		
		
		Thread.sleep(5000);
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle : windowHandles) {
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		

	}

}
