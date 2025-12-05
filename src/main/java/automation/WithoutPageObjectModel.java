package automation;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
public class WithoutPageObjectModel {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
	}
	
	@Test
	public void Admin_TestCase() {
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		userName.sendKeys("admin");
		passWord.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
	}
	
	@Test
	public void PIM_TestCase() {
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		userName.sendKeys("admin");
		passWord.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
	}
	
	@Test
	public void Leave_TestCase() {		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		userName.sendKeys("admin");
		passWord.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Leave']")).click();
	}
	
	@Test
	public void Time_TestCase() {
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		userName.sendKeys("admin");
		passWord.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Time']")).click();		
	}
	
@AfterMethod
	public void tearDown() throws InterruptedException {
	Thread.sleep(4000);
		driver.quit();
	}
	
}
