class Torch{
	static String brand = "EveryDay";
	static String colour = " White and Black Mix";
	static String material = "Fiber";
	static double price = 1199.50;
	static boolean isConnected;
	
	public  static  boolean onOrOff()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Inside the onOrOff () method : ");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Torch is ON ::");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("The Torch is OFF ::");
		}
		System.out.println("End of  the onOrOff () method : ");
		System.out.println("-----------------------------------------------");
		return isConnected;
	}
}