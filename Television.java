class Television{
	
	static String brand="SAMSUNG";
	static String colour="RED";
	static String material="RED";
	static double price=56323.99;
	static String warranty="1 year";
	static boolean isConnected;
	
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
}