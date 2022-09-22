class Speaker1Tester{
	
	public static void main(String[] at)
	{
		System.out.println("Main Method Started");
		System.out.println("-------------------");
		//invoking onOrOff() method
		Speaker1.onOrOff();
		//invoking increaseVolume() method
		Speaker1.increaseVolume();
		Speaker1.increaseVolume();
		Speaker1.increaseVolume();
		Speaker1.increaseVolume();
		Speaker1.increaseVolume();
		//invoking decreaseVolume() method
		Speaker1.decreaseVolume();
		Speaker1.decreaseVolume();
		Speaker1.decreaseVolume();
		Speaker1.onOrOff();//invoking the method 2 nd time is should print..it shows Speaker1 is off...
		Speaker1.increaseVolume();//this will not executed due to current Speaker1 is off
		System.out.println("Main Method Ended");
		System.out.println("-------------------");
		System.out.println("Brand is : "+Speaker1.brand);
		System.out.println("Colour of Product is : "+Speaker1.colour);
		System.out.println("Price is : "+Speaker1.price);
		System.out.println("-------------------");

	}
}