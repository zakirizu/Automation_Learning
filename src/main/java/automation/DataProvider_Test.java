package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class DataProvider_Test {
	
	@Test(dataProvider = "InValidData")
	public void testCase01(String userId, String pwd) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement userName = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@id='pass']"));
		userName.sendKeys(userId);
		passWord.sendKeys(pwd);
		Thread.sleep(3000);
		driver.quit();		
	}
	

	@DataProvider(name = "ValidLoginData")
	public Object[][] getValidData(){
		return new Object[][] {
			{"userName01", "PassWord01"},
			{"userName02", "PassWord02"},
			{"userName03", "PassWord03"},
			{"userName04", "PassWord04"},
			{"userName05", "PassWord05"},				
		};
	}
	
	
	@DataProvider(name = "InValidData")
	public Object[][] getInvalidData(){
		return new Object[][] {
			{"userName01", "xxxxxxxxxx"},
			{"xxxxxxxxxx", "PassWord02"},
			{"userNaxxxme03", "PassWord03"},
			{"userName04", "PasxxxsWord04"},
			{"userNaxxxxme05", "PassWord05"},				
		};
	}
}
