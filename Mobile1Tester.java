class Mobile1Tester{
	
	public static void main (String [] arg)
	{
		Mobile1.onOrOff();
		//invoking increaseVolume() method
		Mobile1.increaseVolume();
		Mobile1.increaseVolume();
		Mobile1.increaseVolume();
		Mobile1.increaseVolume();
		Mobile1.increaseVolume();
		//invoking decreaseVolume() method
		Mobile1.decreaseVolume();
		Mobile1.decreaseVolume();
		Mobile1.decreaseVolume();
		//invoking onOrOff() method
		//Mobile.onOrOff();
		
		System.out.println("------------^^^^^^^^^^------------");
		System.out.println("Television Brand is : "+Mobile1.brand);
		System.out.println("Colour of Product is :"+Mobile1.colour);
		System.out.println("Material type :"+Mobile1.material);
		System.out.println("Price of Product :"+Mobile1.price);
		System.out.println("------------^^^^^^^^^^------------");
		
	}
}