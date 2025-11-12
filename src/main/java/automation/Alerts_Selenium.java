package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Selenium {

	public static void main(String[] args) throws InterruptedException {
		//acceptTheAlert();
		//cancelTheAlert();
		getTextFromAlert();
		//EnterTextIntoAlert();

	}

	private static void EnterTextIntoAlert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		Thread.sleep(4000);
		
		WebElement ele = driver.findElement(By.xpath("(//button[text()='Click Me'])[3]"));
		ele.click();
		
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Zakir");
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
	}

	private static void getTextFromAlert() throws InterruptedException {
		String expectedMessage = "Customer Successfully Delete!";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement customerId = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement submitButton = driver.findElement(By.name("submit"));
		
		customerId.sendKeys("9988776655");
		submitButton.click();
		
		//Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		//Thread.sleep(4000);
		String actualMessage = driver.switchTo().alert().getText();
		
		System.out.println(actualMessage);
		
		if(actualMessage.equals(expectedMessage))
		{
			System.out.println("Test Case PASS");
		}
		else
		{
			System.out.println("Test Case FAIL");
		}
		
		//Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.quit();
}

	private static void cancelTheAlert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement customerId = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement submitButton = driver.findElement(By.name("submit"));
		
		Thread.sleep(4000);
		customerId.sendKeys("9988776655");
		submitButton.click();
		
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss(); //Cancel, No, Dimiss
		driver.close();
	}

	private static void acceptTheAlert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement customerId = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement submitButton = driver.findElement(By.name("submit"));
		
		Thread.sleep(4000);
		customerId.sendKeys("9988776655");
		submitButton.click();
		
		Thread.sleep(4000);
		driver.switchTo().alert().accept(); //yes, Ok, Accept
		driver.close();
		
	}

}
