package temp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import oops_Concepts.ChromeDriverClass;
import oops_Concepts.WebDriverInterface;

public class ZZ_Actions_Class_Questions {
	
	static WebDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		//HoverMouse();
		//Drag_Drop();
		//Right_Click();
		Double_Click();
}

	private static void Double_Click() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		Actions ac = new Actions(driver);
		Thread.sleep(4000);
		ac.doubleClick(doubleClickBtn).build().perform();
		Thread.sleep(4000);
		driver.quit();
		
	}

	private static void Right_Click() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions ac = new Actions(driver);
		Thread.sleep(4000);
		ac.contextClick(rightClickBtn).build().perform();
		Thread.sleep(4000);
		driver.quit();
		
	}

	private static void Drag_Drop() throws InterruptedException {
		driver.get("https://testautomationpractice.blogspot.com/#");
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(4000);
		
		Actions ac = new Actions(driver);
		ac.moveToElement(drag).build().perform();
		Thread.sleep(4000);
		ac.dragAndDrop(drag, drop).build().perform();
		driver.quit();
		
		
		
	}

	private static void HoverMouse() {
		driver.get("https://www.amazon.in");
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions ac = new Actions(driver);
	    ac.moveToElement(signIn).build().perform();		
		WebElement primeMemberShip = driver.findElement(By.xpath("//span[contains(text(),'Your Prime Membership')]"));
		primeMemberShip.click();
		
	}

}
