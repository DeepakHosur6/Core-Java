class Addition{
	
	public static void main(String a[])
	{
		/* normal type  of decelaration and printing the values
		int add =89+78;
		int add1 =89+98;
		int add2 =90+90;
		int add3 =123+142; 
		System.out.println(add);
		System.out.println(add1);
		System.out.println(add2);
		System.out.println(add3); */
		
		//calling a method  
		add(89,78);
		add(89,98);
		add(90,90);
		add(123,142);
				
	}
	// Using method concept we can do code optimize technique.
	// assigning the value in method with 2 variable  decelaration
	public static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
}
