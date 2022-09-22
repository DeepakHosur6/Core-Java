class Mobile{
	static String brand = "Redmi";
	static String colour = " White";
	static String material = "Fiber  Body";
	static double price = 20000.50;
	static boolean isConnected;
	
	public  static  boolean onOrOff()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Inside the onOrOff () method : ");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Mobile turned is ON ::");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("The Mobile turned is OFF ::");
		}
		System.out.println("End of  the onOrOff () method : ");
		System.out.println("-----------------------------------------------");
		return isConnected;
	}
}