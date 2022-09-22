class Cricket2{
	// int type example with for loop
	public static void main(String arg[])
	{
		int rohitHighestScore= 264;
		int sachinHighestScore= 200;
		int mandanHighestScore= 135;
		int ackerrHighestScore= 232;
		int bjClarkHighestScore= 229;

		int highestScores[]= {rohitHighestScore,sachinHighestScore,mandanHighestScore,ackerrHighestScore,bjClarkHighestScore};

		for  (int cindex=0; cindex<highestScores.length; cindex++)
		{
			int ref= highestScores[cindex];
			System.out.println("Element at index:"+cindex+" "+highestScores[cindex]);
			
		}
		
	}
}