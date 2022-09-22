class TorchTester{
	
	public static void main (String [] arg)
	{
		Torch.onOrOff();
		Torch.onOrOff();
		
		System.out.println("------------^^^^^^^^^^------------");
		System.out.println("Television Brand is : "+Torch.brand);
		System.out.println("Colour of Product is :"+Torch.colour);
		System.out.println("Material type :"+Torch.material);
		System.out.println("Price of Product :"+Torch.price);
		System.out.println("------------^^^^^^^^^^------------");
		
	}
}