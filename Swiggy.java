class Swiggy{
	// 
	public static String takeOrder()
	{
		String item ="Pastries";
		if(item=="Pizza"){
			System.out.println("Thank you for Orderring...");
		}
		if(item=="Bugger"){
			System.out.println("Thank you for Orderring...");
		}
		if(item=="Pani Puri"){
			System.out.println("Thank you for Orderring...");
		}
		if(item=="Gobi"){
			System.out.println("Thank you for Orderring...");
		}
		if(item=="French Fryes"){
			System.out.println("Thank you for Orderring...");
		}
		if(item=="Sandwitch"){
			System.out.println("Thank you for Orderring...");
		}
		if(item=="Pastries"){
			System.out.println("Thank you for Orderring...");
		}	
		// if we miss return type then, error is: missing return type statement
		return item; // we canot write after the return statement because its method conition. so write before return..
	}
}