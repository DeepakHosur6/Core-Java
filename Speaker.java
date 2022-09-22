class Speaker{
	
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
}