package conceptoverloading;

public class CarromBord {
	public String material;
	public int conies;
	public int noOfPlayers;
	public String playersName[] = new String[4];
	
	
	public CarromBord()
	{
		System.out.println("carrom board constructor is called");
	}

	
	public CarromBord(String material,int conies,int noOfPlayer,String [] playersName)
	{
		this();	//this() is method, which used for constructor chaining 
		this.material = material;
		this.conies =conies;
		this.noOfPlayers =noOfPlayer;
		this.playersName = playersName;
		
	}
	
	public void displayInfo()
	{
		
		System.out.println(this.material + " " + this.conies + " "  + this.noOfPlayers);
		
		System.out.println("carrom board players names are ");
		
		for (int i=0 ; i<playersName.length ; i++)
		{
			
			System.out.print(playersName[i]+ " ");
		}
	}
}


