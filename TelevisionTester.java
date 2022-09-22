class TelevisionTester{
	public static void main(String [] arg)
	{
		// invoking the method should always end with ()
		Television.onOrOffTelevision();
		Television.onOrOffTelevision();//invoking the method 2 nd time is should print off also
		Television.onOrOffTelevision();//invoking method 3rd time is should print 2 tme on & 1 time off
		
		System.out.println("------------^^^^^^^^^^------------");
		System.out.println("Television Brand is : "+Television.brand);
		System.out.println("Colour of Product is :"+Television.colour);
		System.out.println("Material type :"+Television.material);
		System.out.println("Price of Product :"+Television.price);
		System.out.println("warranty of  product :"+Television.warranty);
		System.out.println("------------^^^^^^^^^^------------");
	
	}
}