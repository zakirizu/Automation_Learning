package oops_Concepts;

public class ChromeDriverClass implements WebDriverInterface {

	public static void main(String[] args) {
		//Interface obj = new ImplemtationClass();
		WebDriverInterface obj = new ChromeDriverClass();
		obj.click();
		obj.Select();
		obj.sendKeys();

	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("I am clicking using the code from ChromeDriver Class");
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		System.out.println("I am Sending keys using the code from ChromeDriver Class");
	}

	@Override
	public void Select() {
		// TODO Auto-generated method stub
		System.out.println("I am Selecting using the code from ChromeDriver Class");
	}

}
