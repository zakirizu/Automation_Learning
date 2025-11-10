package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_DropDownList {

	public static void main(String[] args) throws InterruptedException {
		//selectClass();
		commomMehtodToSelectLastButonvalue("//select[@id='cars']");
		InterviewQuesiotns();
		
	}

	private static void InterviewQuesiotns() {
		/*
1.	What is the Select class in Selenium?
2.	How to get all options from a dropdown?
3.	How to get the first selected option?
4.	How to check if a dropdown allows multiple selections?
5.	How to select multiple options in a multi-select dropdown?
6.	How to deselect options in a multi-select dropdown?
7.	How to get all selected options?
8.	How to verify if a specific option is selected?
9.	How to handle dropdown without using Select class?
10.	Write a real-time example using Select class to select a country and print all available options.
11.	What happens if you use the Select class on a dropdown that is not built with a <select> tag?
12.	How to select a dropdown value by visible text?
13.	How to select a dropdown value by index?
14.	How to select a dropdown value by value attribute?
*/
		
	}

	private static void commomMehtodToSelectLastButonvalue(String ddlXpath) throws InterruptedException {	
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationtesting.co.uk/dropdown.html");	
		Thread.sleep(8000);
		driver.manage().window().maximize();
		WebElement ddl = driver.findElement(By.xpath(ddlXpath));
		Select sc = new Select(ddl);		
		int length = sc.getOptions().size();		
		System.out.println("Lenghth is "+length);		
		sc.selectByIndex(length-2);		
		Thread.sleep(4000);
		driver.close();
	}
	
	
	
	
	
	
	
	

	private static void selectClass() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ddlElement = driver.findElement(By.xpath("//select[contains(@id,\"dropdown-class\")]"));
		driver.manage().window().maximize();
		
		//From Drop Down List Make use of the Select Class		
		//ClassName obj = new ClassName();
		
		Select sc = new Select(ddlElement);
		sc.selectByVisibleText("Option2");
		
		Thread.sleep(5000);
		
		sc.selectByIndex(3);
		
		Thread.sleep(8000);
		
		sc.selectByValue("option1");
		Thread.sleep(5000);
		
		sc.selectByValue("option2");
		
		
		driver.close();
		
	}

}
