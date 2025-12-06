package automation;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Search_Flipkart {
	String URL;
	String browserType;
	WebDriver driver;
	
	//String projectPath = System.getProperty("user.dir");
	@BeforeMethod
	public void setup() throws Exception {
		String filePath = "C:\\Repos\\Automation_Learning\\Resources\\propertyFile.properties";
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		URL = prop.getProperty("qa_url");
		System.out.println("URL from property file: " + URL);
		
		browserType = prop.getProperty("browser");
		
		if(browserType.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();			
		}
		else if(browserType.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if(browserType.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Pleas use only this keyword chrome, FireFox , Edge");
		}
}
	
	
	
	
	@Test
	public void searchFlipkart() {		
		driver.get(URL);
		System.out.println("Search_Flipkart");
	}
	
	@Test
	public void voiceSearch() {
		driver.get(URL);
		System.out.println("voiceSearch");
	}

	
	@Test
	public void searchFlipkart2() {		
		driver.get(URL);
		System.out.println("Search_Flipkart");
	}
	
	@Test
	public void voiceSearch3() {		
		driver.get(URL);
		System.out.println("voiceSearch");
	}

	
	@Test
	public void searchFlipkart3() {		
		driver.get(URL);
		System.out.println("Search_Flipkart");
	}
	
	@Test
	public void voiceSearch4() {		
		driver.get(URL);
		System.out.println("voiceSearch");
	}


	
}
