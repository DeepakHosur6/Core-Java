class CitizenOfIndia{
	
	public static void showTheResponsibility()
	//public static void showTheResponsibility(int age, char gender) //for passing parameter value
	{
		//int age = 13;
		char gender ='F'; //Local  Variable
		int age = 21;	  //Local  Variable
		// AND Operator is &&
		// OR Operator is ||
		if (age>=10 && age < 16){
			
			System.out.println("Responsibility is School : " );
		}
		if (age == 16){
			
			System.out.println("Responsibility is College : " );
		}
		if (age == 21){
			
			System.out.println("Responsibility is Voting : " );
			if(gender == 'F')
			{
				System.out.println("Girl can Leggally Marry : " );
			}
			else {
				System.out.println("Boy cannot Leggally Marry : " );
			}
		}
		
		
	}
	
}