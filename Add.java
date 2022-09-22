class Add
{

	public static void main(String  arg[])
	{
		//invoking the add method
		// arguments---> must  match the  parameters
		//add(123L,234); //error should be seen.due to  declaration of  long L
		add(14,456);
		add(122,856);
		add(182,416);
		add(120,4556);
	}
	
	//add method Declaration
	public static void add(int dev, int devi)
	{
		//assign the operators
		System.out.println(dev + devi);
	}
}