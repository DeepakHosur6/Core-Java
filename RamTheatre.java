class RamTheatre{
	//For array varibles Declaration	&	Initialize...
	static int priceofKannadaMovies[]={1000,250,200,500};
	static String kannadaMovies[]={"KGF","OM","I","Vikram"};
	static int priceofHidiMovies[]={100,350,400,200};
	static String hindiMovies[]={"3idoits","pk","u","vv"};
	
	public static void main (String args[]){
		
		System.out.println("List of	kannada movie Names"); 
		System.out.println(kannadaMovies[0] + " "+
		kannadaMovies[1] + " " +
		kannadaMovies[2] + " " +
		kannadaMovies[3] );
		
		System.out.println("---------------------"); 
		System.out.println("Price of movie Names"); 
		System.out.println(priceofKannadaMovies[0] + " "+
		priceofKannadaMovies[1] + " " +
		priceofKannadaMovies[2] + " " +
		priceofKannadaMovies[3] );
		
		System.out.println("---------------------");
		System.out.println(hindiMovies[0] + " "+
		hindiMovies[1] + " " +
		hindiMovies[2] + " " +
		hindiMovies[3] );
		
		System.out.println("---------------------"); 
		System.out.println("Price of Hidi	movie Names"); 
		System.out.println(priceofHidiMovies[0] + " "+
		priceofHidiMovies[1] + " " +
		priceofHidiMovies[2] + " " +
		priceofHidiMovies[3] );
	}
}