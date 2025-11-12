package temp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZZ_Alerts {

	public static void main(String[] args) throws InterruptedException {
		//AcceptAlert();
		//DismissAlert();
		getTextFromAlert();
	}

	private static void getTextFromAlert() {
		String expectedMessage = "Customer Successfully Delete!";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.switchTo().alert().accept();
		String actulaMessage = driver.switchTo().alert().getText();
		if(expectedMessage.equals(actulaMessage)) {
			System.out.println("Test Passed");
		}
		driver.switchTo().alert().accept();
		driver.close();
		
	}

	private static void DismissAlert() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("53920");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("112233");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		driver.switchTo().alert().accept();
		driver.close();
		System.out.println("Alert dismissed successfully");
	}

	private static void AcceptAlert() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/popups.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Trigger Alert']")).click();		
		driver.switchTo().alert().accept();
		driver.close();
		System.out.println("Alert handled successfully");		
	}

}
