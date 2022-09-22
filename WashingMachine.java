class WashingMachine{
	static String brand = "IBF";
	static String colour = "Mikly White";
	static String material = "Fiber  Body";
	static double price = 40345.50;
	static boolean isConnected;
	
	public  static  boolean onOrOff()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Inside the onOrOff () method : ");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The WashingMachine is ON ::");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("The WashingMachine is OFF ::");
		}
		System.out.println("End of  the onOrOff () method : ");
		System.out.println("-----------------------------------------------");
		return isConnected;
	}
}