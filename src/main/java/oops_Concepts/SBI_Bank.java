package oops_Concepts;

 public class SBI_Bank implements InterfaceOne, InterfaceTwo {
	 
	 public static void main(String[] args)
	 {
		 //ClassName obj = new ClassName();
		 //Interface obj = new ImplemetingClass();
		 InterfaceOne obj = new SBI_Bank();
		 obj.RateOfInterest();
		 obj.LoanEligibilty();
		 obj.CBILCheck();
		 
		 InterfaceTwo obj2 = new SBI_Bank(); 
		 obj2.repoRate();
		 
	 }



	@Override
	public void RateOfInterest() {
		System.out.println("Code to Check ROI");
	}

	@Override
	public void LoanEligibilty() {
		System.out.println("Code to Check LoanEligibiility");
		
	}
	
	public void CBILCheck() {
		System.out.println("Code to CBIL Check");
	}


	@Override
	public void repoRate() {
		System.out.println("RepoRate");
		
	}
	
	
	


}
