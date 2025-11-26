package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Waits_ExplicitiWait {
	
	
	@Test
	public void explicitWaitExample() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
		driver.manage().window().maximize();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//60 Seconds
		//Explicit Wait
		WebDriverWait ExpWait = new WebDriverWait(driver, Duration.ofSeconds(40));		
		ExpWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='city']")));
		
		
		
		
	}
	

}
