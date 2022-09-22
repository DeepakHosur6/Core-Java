class ShowRoomTester{
	public static void main(String [] ShowRooms)
	{
		System.out.println("~~~ Welcome to ShowRoom of Cars & Bikes ~~~");
		System.out.println("======================================="); 	
		System.out.println("-Welcome to Bike Section-");
		String[] bikeData  ={"1:Plusar 220", "2:Ktm", "3:Hero", "4:Honda Shine", "5:Hero Xtreme", 
		"etc..."};
		ShowRoom.getBike(bikeData);
		System.out.println("=======================================");
		System.out.println("-Welcome to Car Section-");
		String[] carData  ={"1:Mahindra Xuv300", "2:Creta", "3:Sonet", "4:Tata Punch", "5:Bmw","etc..."};
		ShowRoom.getCar(carData);
		
	}
}