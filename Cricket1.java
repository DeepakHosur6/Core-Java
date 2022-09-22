class Cricket1{
	// String type ex 
	public static void main(String arg[])
	{
		String rohitHighestScore= "264";
		String sachinHighestScore= "200";
		String mandanHighestScore= "135";
		String ackerrHighestScore= "232";
		String bjClarkHighestScore= "229";

		String highestScores[]= {rohitHighestScore,sachinHighestScore,mandanHighestScore,ackerrHighestScore,bjClarkHighestScore};
		
		String ref0 = highestScores[0];
		String ref1 = highestScores[1];
		String ref2 = highestScores[2];
		String ref3 = highestScores[3];
		String ref4 = highestScores[4];

//Exterrnal/explicit way of String array variable returned from array element
		System.out.println("Element at index 4: "+" "+ref0);
		System.out.println("Element at index 0: "+" "+ref1);
		System.out.println("Element at index 3: "+" "+ref2);
		System.out.println("Element at index 3: "+" "+ref3);
		System.out.println("Element at index 3: "+" "+ref4);

	}
}