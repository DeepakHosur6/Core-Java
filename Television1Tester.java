class Television1Tester{
	public static void main(String [] arg)
	{
		// invoking the method should always end with ()
				System.out.println("Main Method Started");
		System.out.println("-------------------");
		//invoking onOrOff() method
		Television1.onOrOffTelevision();
		//invoking increaseVolume() method
		Television1.increaseVolume();
		Television1.increaseVolume();
		Television1.increaseVolume();
		Television1.increaseVolume();
		Television1.increaseVolume();
		//invoking decreaseVolume() method
		Television1.decreaseVolume();
		Television1.decreaseVolume();
		Television1.decreaseVolume();
		Television1.onOrOffTelevision();
		System.out.println("------------^^^^^^^^^^------------");
		System.out.println("Television1 Brand is : "+Television1.brand);
		System.out.println("Colour of Product is :"+Television1.colour);
		System.out.println("Material type :"+Television1.material);
		System.out.println("Price of Product :"+Television1.price);
		System.out.println("warranty of  product :"+Television1.warranty);
		System.out.println("------------^^^^^^^^^^------------");
	
	}
}