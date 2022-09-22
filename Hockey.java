class Hockey{
	
	static void getTeamMember(String[] teamHockey)
	{
		
		System.out.println("Inside Hockey() method");
		System.out.println("Size of Hockey is : "+ teamHockey.length);
		System.out.println("List of Hockey are :");
		for(int index=0; index < teamHockey.length; index++)
		{
			System.out.println(teamHockey[index]);
		}		
		System.out.println("End of Hockey() method");
	}
}