package automation;
import oops_Concepts.ChromeDriverClass;
import oops_Concepts.WebDriverInterface;

public class Demo {

	public static void main(String[] args) {
		
		//ChromeDriver
		//Interface obj = new ImplemtingClass();
		WebDriverInterface driver = new ChromeDriverClass();
		driver.click();
		driver.Select();
		driver.sendKeys();
		
		
		
		

	}

}
