class Television1{
	
	static String brand="SAMSUNG";
	static String colour="RED";
	static String material="RED";
	static double price=56323.99;
	static String warranty="1 year";
	static boolean isConnected;
		static int minVolume;
	static int maxVolume=8;
	static int currentVolume;
	
	//creating method is onOrOffTelevision
	public static boolean onOrOffTelevision()
	{
		System.out.println("-----------------------------------------------");
		System.out.println("This is inside the onOrOffTelevision() method :");
		//this  if  will show when the method onOrOffTelevision() is invoked 1 and 3rd time in file TelevisionTester.
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Television is ON :");
		}
		//this else if  will show when the method onOrOffTelevision() is invoked 2nd time in file TelevisionTester.
		else if(isConnected==true){
			isConnected=false;
			System.out.println("Now Television is OFF :"); 
			System.out.println("-----------------------------------------------");
		}
		System.out.println(" End of onOrOffTelevision() method :");
		return isConnected ;
	}
	public static void increaseVolume(){
	System.out.println("This is inside  increaseVolume");
	if(isConnected==true)
	{
		if(currentVolume < maxVolume)
		{
			currentVolume=currentVolume+1;
			System.out.println("The current Volume is :"+currentVolume);
		}
		else {
			System.out.println("Max  Volume is reached :" );
		}
	}
	 else{
		System.out.println("Gube... first turn On Television :" );
		}	
	System.out.println("The is end of  increaseVolume");
	}
	
	public static void decreaseVolume(){
	System.out.println("--------------------------------------------------- ");
	System.out.println("The is inside  decreaseVolume: ");
	if(isConnected==true)
	{
		if(currentVolume > minVolume)
		{
			currentVolume=currentVolume-1;
			System.out.println("The current Volumeis :"+currentVolume);
		}
		else {
			System.out.println("Min  Volume is reached :" );
		}
	}
	 else{
		System.out.println("Gube... first turn On Television :" );
		}	
	System.out.println("This is end of  decrease Volume----");
	System.out.println("--------------------------------------------------- ");
	}
	
}