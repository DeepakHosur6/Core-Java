class Ac1{
	static String brand = "Mi";
	static String colour = "Mikly White";
	static String material = "Fiber with Metal Body";
	static double price = 12345.99;
	static boolean isConnected;
	static int minSpeed;
	static int maxSpeed=10;
	static int currentSpeed;
	
	public  static  boolean onOrOff()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("Inside the onOrOff () method : ");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Ac is turned ON ::");
		}
		else if(isConnected==true){
			isConnected=false;
			System.out.println("The Ac is turned OFF ::");
		}
		System.out.println("End of  the onOrOff () method : ");
		System.out.println("-----------------------------------------------");
		return isConnected;
	}
	//System.out.println("This current Speed is : "+currentSpeed);
	//System.out.println("-----------------------------------------------");
	public  static void increaseSpeed()
	{
		System.out.println("Inside the increaseSpeed () method : ");
		System.out.println("");
		if(isConnected){
			if(currentSpeed<maxSpeed)
			{
				currentSpeed=currentSpeed+1;
				System.out.println("The current Speed Increased to : "+currentSpeed);
			}
			else {
				System.out.println("Max  Speed is reached!!!!!!! :" );
			}
		}
		else{
			System.out.println("Hey Stupid first turn on the Ac :" );
		}
		System.out.println("THIS  IS End of increaseSpeed() Method  ");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	}
	
	public static void decreaseSpeed()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("THIS  IS inside the decreaseSpeed() Method  ");
		System.out.println("");
		if(isConnected){
			if (currentSpeed>minSpeed){
				currentSpeed=currentSpeed-1;
				System.out.println("The Speed is Decreased to : "+currentSpeed);
			}
			else{
				System.out.println("Min Speed is reached!!!!!!! :" );
			}
		}
		else{
			System.out.println("Hey Stupid first turn on the Ac :" );
		}
		System.out.println("THIS  IS End of decreaseSpeed() Method  ");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	
	}
	
}