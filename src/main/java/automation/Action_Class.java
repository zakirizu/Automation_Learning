package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {

	public static void main(String[] args) throws InterruptedException {
		//MoveToElement();
		//RightClick(); //->Context Click
		//DoubleClick();
		DragAndDrop();
		
		

	}

	private static void DragAndDrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/#");
		Thread.sleep(4000);
		driver.manage().window().maximize();

		
		WebElement fromElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement toElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(4000);
		Actions ac = new Actions(driver);
		
		//This is just to view from screen- Not needed in real time 
		WebElement ele = driver.findElement(By.xpath("//button[text()='Upload Multiple Files']"));
		ac.moveToElement(ele).build().perform();
		Thread.sleep(6000);
		//-------
		
		ac.dragAndDrop(fromElement, toElement).build().perform();
		Thread.sleep(4000);
				
	}

	private static void DoubleClick() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions ac = new Actions(driver);
		ac.doubleClick(button).build().perform();
		Thread.sleep(4000);
		driver.close();		
	}

	private static void RightClick() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(button).build().perform();
		Thread.sleep(4000);
		driver.close();		
	}

	private static void MoveToElement() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		
		WebElement accountsSign = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions ac = new Actions(driver);
		Thread.sleep(3000);
		ac.moveToElement(accountsSign).build().perform();
		
		
		WebElement PrimeVideoLink = driver.findElement(By.xpath("//span[text()='Your Prime Membership']"));		
		Thread.sleep(3000);
		PrimeVideoLink.click();
		driver.close();

	}

}
