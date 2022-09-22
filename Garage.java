class  Garage{
	static void getVechileNo(String[] vechiles)
	{
		System.out.println("======================================="); 	
		System.out.println("Inside getVechileNo() method");
		System.out.println("Size of vechiles is : "+ vechiles.length);
		System.out.println("List of vechiles are :");
		for(int index=0; index < vechiles.length; index++)
		{
			System.out.println(vechiles[index]);
		}		
		System.out.println("End of getVechileNo() method");
	}

}