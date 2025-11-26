package testNG;
import org.testng.annotations.Test;
public class Search {
	
	@Test
	public void SearchProduct() {
		System.out.println("Product Searched Successfully");
	}

	@Test
	public void AdvancedSearchProduct() {
		System.out.println("Advanced Product Search Successful");
	}
	
	@Test
	public void SearchByCategory() {
		System.out.println("Product Searched by Category Successfully");
	}
	
	@Test
	public void SearchByBrand() {
		System.out.println("Product Searched by Brand Successfully");
	}
}
