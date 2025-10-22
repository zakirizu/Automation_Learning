package java_Learning;

public class SmartTaxCalculator {
	float cgstRate;
	float sgstRate;
	
	public static void main(String[] args) {
		SmartTaxCalculator tn = new SmartTaxCalculator(9,10);
		tn.anyState();
		
		SmartTaxCalculator tg = new SmartTaxCalculator(14,12);
		tg.anyState();
		
		SmartTaxCalculator ap = new SmartTaxCalculator(16,14);
		ap.anyState();
		
	}
	

	public SmartTaxCalculator(float x, float y)
	{
		cgstRate = x;
		sgstRate = y;		
	}

	private  void anyState() {
        // Given values
       float basePrice = 1000;  // Base cost of the product
    
        // Calculate CGST and SGST amounts
        float cgstAmount = (basePrice * cgstRate) / 100;
        float sgstAmount = (basePrice * sgstRate) / 100;
        
        // Calculate total price including GST
        float totalPrice = basePrice + cgstAmount + sgstAmount;
        System.out.println("Base Price in (Including GST): " + totalPrice);
		//Test
	}




	
	

}
