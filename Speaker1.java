class Speaker1{
	
	static String brand = "Sony";
	static String colour ="White";
	static double price =1200.00;
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=8;
	static int currentVolume;
	
	//static boolean isConnected=false; // same as above up by assigning the manual value.
	//method is onOrOff()
	//functionality
	public static boolean onOrOff()
	{
		System.out.println("inside onOrOff()");
		//== relational operator
		// this means false==false;
		if(isConnected == false){
			isConnected= true; // = inilization operator
			System.out.println(" Speaker is turned ON--");	
		}
		//if(isConnected == true){
		else  if(isConnected == true){
			
			isConnected=false;
			System.out.println(" Speaker is turned Off--");
			
		}	
		System.out.println("end of onOrOff()");
		System.out.println("----------------");
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
		System.out.println("Gube... first turn On Speaker :" );
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
		System.out.println("Gube... first turn On Speaker :" );
		}	
	System.out.println("This is end of  decrease Volume----");
	System.out.println("--------------------------------------------------- ");
	}
	
}