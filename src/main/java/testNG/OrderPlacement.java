package testNG;
import org.testng.annotations.Test;
public class OrderPlacement {
	
	@Test
	public void OrderPlaced() {
		System.out.println("Order Placed Successfully");
	}

	@Test
	public void OrderCancelled() {
		System.out.println("Order Cancelled Successfully");
	}
	
	@Test
	public void OrderReturned() {
		System.out.println("Order Returned Successfully");
	}
	
	@Test
	public void OrderTracked() {
		System.out.println("Order Tracked Successfully");
	}
	
}
