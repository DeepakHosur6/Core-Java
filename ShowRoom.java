class ShowRoom{
	static void getBike(String[] bikes)
	{
		
		System.out.println("Inside getBike() method");
		System.out.println("Size of Bike is : "+ bikes.length);
		System.out.println("List of Bike are :");
		for(int index=0; index < bikes.length; index++)
		{
			System.out.println(bikes[index]);
		}		
		System.out.println("End of getBike() method");
	}
	static void getCar(String[] cars)
	{
		System.out.println("=======================================");
		System.out.println("Inside getCar() method");
		System.out.println("Size of Car is : "+ cars.length);
		System.out.println("List of Car are :");
		for(int index=0; index < cars.length; index++)
		{
			System.out.println(cars[index]);
		}		
		System.out.println("End of getCar() method");
	}
	

}