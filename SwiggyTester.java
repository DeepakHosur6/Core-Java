class SwiggyTester{
	// 
	public static void main (String [] args)
	{
		//invoking method i.e takeOrder()
		//
		String ref = Swiggy.takeOrder();
		
		// this sop is because of String declaration in method so i should writ +ref at sop end
		System.out.println("You`r Final Order is ready...with : "+ref );
		
		//if we declare void in method then Swiggy.takeOrder();be invoking
		//if we declare void then System.out.println("You`r Final Order is ready...with : ");
	}
}