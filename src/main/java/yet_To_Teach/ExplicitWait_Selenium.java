package yet_To_Teach;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait_Selenium {
	
	
	@Test
	public void TestCase_With_explicitWaitExample() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cotvti-row-dt4.pega.net/prweb/app/hdap/4sQ1uGB36iO1QZw4xl3BL6CyZUv6LdMq");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("txtUserID")).sendKeys("Automation_qa");
		driver.findElement(By.id("txtPassword")).sendKeys("rules@123");
		driver.findElement(By.id("sub")).click();	
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='PegaGadget0Ifr']"));
		driver.switchTo().frame(frameElement);
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();		
		driver.findElement(By.xpath("//input[@name='$PAdvancedSearchCriteriaPage$pRGSearchData$pRequestGroupName']")).sendKeys("Te");
		driver.findElement(By.xpath("(//button[text()='Search'])[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'result(s)')]")));
		driver.quit();
	}
	
	@Test()
	public void TestCase_WithOut_explicitWaitExample() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cotvti-row-dt4.pega.net/prweb/app/hdap/4sQ1uGB36iO1QZw4xl3BL6CyZUv6LdMq");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUserID")).sendKeys("Automation_qa");
		driver.findElement(By.id("txtPassword")).sendKeys("rules@123");
		driver.findElement(By.id("sub")).click();
		Thread.sleep(10000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='PegaGadget0Ifr']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='$PAdvancedSearchCriteriaPage$pRGSearchData$pRequestGroupName']")).sendKeys("Te");
		driver.findElement(By.xpath("(//button[text()='Search'])[1]")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'result(s)')]")));
		Thread.sleep(40000);
		WebElement results = driver.findElement(By.xpath("//div[contains(text(),'result(s)')]"));
		if(results.isDisplayed()) {
			System.out.println("Search results are displayed");
		} else {
			System.out.println("Search results are not displayed");
		}
		driver.quit();
	}

}
