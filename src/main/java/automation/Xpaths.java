package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpaths {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver - Interface --> Only UnImlemented Methods
			//Sendkeys, Click, get, refresh , back
		
		//ChromeDriverClass
			//Sendkeys, Click, get, refresh , back
		
		//FireFoxClass
			//Sendkeys, Click, get, refresh , back

		//Interafce obj = new ImplementignClass();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement userName 	= driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passWord 	= driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement loginButton 	= driver.findElement(By.xpath("//button[@name='login']"));
		
		userName.sendKeys("zakir.13.2011");
		passWord.sendKeys("Tester");
		loginButton.click();
		
		Thread.sleep(8000);
		
		driver.close();
		
		
		
	}

}
