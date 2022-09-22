class SpeakerTester{
	
	public static void main(String[]at){
		System.out.println("Main Method Started");
		System.out.println("-------------------");
		//invoking onOrOff() 
		Speaker.onOrOff();
		Speaker.onOrOff();//invoking the method 2 nd time is should print off also
		System.out.println("Main Method Ended");
		System.out.println("Brand is : "+Speaker.brand);
		System.out.println("Colour of Product is : "+Speaker.colour);
		System.out.println("Price is : "+Speaker.price);

	}
}