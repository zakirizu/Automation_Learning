package automation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Without_TestNG {
	static int a = 30;
	static int b = 20;

	public static void main(String[] args) {
		addition();
		subtraction();
		multiplication();
		division();
		concatination();
		facebookLogin();
	}
	
	

	private static void facebookLogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email_user"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("");
		password.sendKeys("");
		
		driver.quit();
		
	}


	private static void facebookLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("sdsds");
		password.sendKeys("sdsds");
		
		driver.quit();
		
	}
	
	private static void facebookLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("sdsds");
		password.sendKeys("xxxxxx");
		
		driver.quit();
		
	}


	private static void facebookLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("xxxxx");
		password.sendKeys("sdsds");
		
		driver.quit();
		
	}
	
	private static void facebookLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("xxxxx");
		password.sendKeys("xxxxx");
		
		driver.quit();
		
	}
	
	private static void facebookLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("sdsds");
		password.sendKeys("sdsds");
		
		driver.quit();
		
	}
	
	private static void facebookLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("sdsds");
		password.sendKeys("sdsds");
		
		driver.quit();
		
	}
	
	private static void facebookLogin1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		email.sendKeys("sdsds");
		password.sendKeys("sdsds");
		
		driver.quit();
		
	}
	
	private static void concatination() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnzdemo.github.io/BasicCalculator.html#main-body");
		driver.manage().window().maximize();
		
		int sum = a+b;
		WebElement firstNumber = driver.findElement(By.xpath("//input[@id='number1Field']"));
		WebElement secondNumber = driver.findElement(By.xpath("//input[@id='number2Field']"));
		WebElement operation = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
		Select sc = new Select(operation);
		sc.selectByVisibleText("Add");
		WebElement calculate = driver.findElement(By.xpath("//button[@id='calculateButton']"));
		calculate.click();		
		WebElement answer = driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
		
		driver.quit();
		
	}

	private static void division() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html#main-body");
		driver.manage().window().maximize();
		
		int sum = a/b;
		WebElement firstNumber = driver.findElement(By.xpath("//input[@id='number1Field']"));
		WebElement secondNumber = driver.findElement(By.xpath("//input[@id='number2Field']"));
		WebElement operation = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
		Select sc = new Select(operation);
		sc.selectByVisibleText("Division");
		WebElement calculate = driver.findElement(By.xpath("//button[@id='calculateButton']"));
		calculate.click();		
		WebElement answer = driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
		
		driver.quit();
	}

	private static void multiplication() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html#main-body");
		driver.manage().window().maximize();
		
		int sum = a*b;
		WebElement firstNumber = driver.findElement(By.xpath("//input[@id='number1Field']"));
		WebElement secondNumber = driver.findElement(By.xpath("//input[@id='number2Field']"));
		WebElement operation = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
		Select sc = new Select(operation);
		sc.selectByVisibleText("Multiplication");
		WebElement calculate = driver.findElement(By.xpath("//button[@id='calculateButton']"));
		calculate.click();		
		WebElement answer = driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
		
		driver.quit();
		
	}

	private static void subtraction() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html#main-body");
		driver.manage().window().maximize();
		
		int sum = a-b;
		WebElement firstNumber = driver.findElement(By.xpath("//input[@id='number1Field']"));
		WebElement secondNumber = driver.findElement(By.xpath("//input[@id='number2Field']"));
		WebElement operation = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
		Select sc = new Select(operation);
		sc.selectByVisibleText("Subraction");
		WebElement calculate = driver.findElement(By.xpath("//button[@id='calculateButton']"));
		calculate.click();		
		WebElement answer = driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
		
		driver.quit();
		
	}

	private static void addition() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testsheepnz.github.io/BasicCalculator.html#main-body");
		driver.manage().window().maximize();
		
		int sum = a+b;
		WebElement firstNumber = driver.findElement(By.xpath("//input[@id='number1Field']"));
		WebElement secondNumber = driver.findElement(By.xpath("//input[@id='number2Field']"));
		WebElement operation = driver.findElement(By.xpath("//select[@id='selectOperationDropdown']"));
		Select sc = new Select(operation);
		sc.selectByVisibleText("Add");
		WebElement calculate = driver.findElement(By.xpath("//button[@id='calculateButton']"));
		calculate.click();		
		WebElement answer = driver.findElement(By.xpath("//input[@id='numberAnswerField']"));
		
		driver.quit();
		
	}

}
