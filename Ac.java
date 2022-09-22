class Ac{
	static String brand = "Mi";
	static String colour = "Mikly White";
	static String material = "Fiber with Metal Body";
	static double price = 12345.99;
	static boolean isConnected;
	
	public  static  boolean onOrOff()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Inside the onOrOff () method : ");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Ac is ON ::");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("The Ac is OFF ::");
		}
		System.out.println("End of  the onOrOff () method : ");
		System.out.println("-----------------------------------------------");
		return isConnected;
	}
}