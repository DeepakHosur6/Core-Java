class Mobile1{
	static String brand = "Redmi";
	static String colour = " White";
	static String material = "Fiber  Body";
	static double price = 20000.50;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=8;
	static int currentVolume;
	
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
	public  static void increaseVolume()
	{
		System.out.println("Inside the increaseVolume () method : ");
		System.out.println("");
		if(isConnected){
			if(currentVolume<maxVolume)
			{
				currentVolume=currentVolume+1;
				System.out.println("The current Volume Increased to : "+currentVolume);
			}
			else {
				System.out.println("Max  Volume is reached!!!!!!! :" );
			}
		}
		else{
			System.out.println("Hey Stupid first turn on the Ac :" );
		}
		System.out.println("THIS  IS End of increaseVolume() Method  ");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	}
	
	public static void decreaseVolume()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("THIS  IS inside the decreaseVolume() Method  ");
		System.out.println("");
		if(isConnected){
			if (currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The Volume is Decreased to : "+currentVolume);
			}
			else{
				System.out.println("Min Volume is reached!!!!!!! :" );
			}
		}
		else{
			System.out.println("Hey Stupid first turn on the Mobile :" );
		}
		System.out.println("THIS  IS End of decreaseVolume() Method  ");
		System.out.println("-----------------------------------------------");
		System.out.println("");
	
	}
	
}