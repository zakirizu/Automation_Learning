package oops_Concepts;

public class FireFoxDriverClass implements WebDriverInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverInterface obj = new FireFoxDriverClass();

	}
	

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("I am clicking using the code from FireFoxDriverClass Class");
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		System.out.println("I am Sending keys using the code from FireFoxDriverClass Class");
	}

	@Override
	public void Select() {
		// TODO Auto-generated method stub
		System.out.println("I am Selecting using the code from FireFoxDriverClass Class");
	}

}
