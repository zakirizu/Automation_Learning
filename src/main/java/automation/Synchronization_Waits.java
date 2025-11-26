package automation;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Synchronization_Waits {
	
	@Test()
	public void withOutWaits() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cotvti-row-dt4.pega.net/prweb/app/hdap/UyJnJHJIFYCXNB-OmkERpw");
		driver.manage().window().maximize();
		
		Thread.sleep(8000);
		driver.findElement(By.id("txtUserID")).sendKeys("Automation_qa");
		driver.findElement(By.id("txtPassword")).sendKeys("rules@123");
		driver.findElement(By.id("sub")).click();
		
		Thread.sleep(8000); 
		WebElement frameOne = driver.findElement(By.xpath("//iframe[@id='PegaGadget0Ifr']"));	
		driver.switchTo().frame(frameOne);
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@name='$PAdvancedSearchCriteriaPage$pRGSearchData$pRequestGroupName']")).sendKeys("Te");
		driver.findElement(By.xpath("(//Button[text()='Search'])[1]")).click();
		
		Thread.sleep(30000);
		driver.findElement(By.xpath("//div[contains(text(),'result(s)')]")).click();
		driver.quit();
		
		
	}
	
	@Test()
	public void withWaits() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cotvti-row-dt4.pega.net/prweb/app/hdap/UyJnJHJIFYCXNB-OmkERpw");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
	
		driver.findElement(By.id("txtUserID")).sendKeys("Automation_qa");
		driver.findElement(By.id("txtPassword")).sendKeys("rules@123");
		driver.findElement(By.id("sub")).click();
		
		
		WebElement frameOne = driver.findElement(By.xpath("//iframe[@id='PegaGadget0Ifr']"));	
		driver.switchTo().frame(frameOne);
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();		
		driver.findElement(By.xpath("//input[@name='$PAdvancedSearchCriteriaPage$pRGSearchData$pRequestGroupName']")).sendKeys("Te");
		driver.findElement(By.xpath("(//Button[text()='Search'])[1]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'result(s)')]")));
		
		driver.quit();
		
	}
	

	
	

}
