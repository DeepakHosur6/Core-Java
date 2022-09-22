class DmartTester{

	public static void main(String [] shopping)
	{
		System.out.println("~~~ Welcome to Dmart SuperMarket ~~~");
		System.out.println("======================================="); 	

		System.out.println("-Welcome to Vegatables Section-");
		String[] vegatables  ={"1:Tomato", "2:Potato", "3:Beans", "4:Lady`s Finger", "5:Onion", 
		"6:Capsicum", "7:Cauliflower", "8:Beetroot", "9:Pumpkin", "10:Carrot", "11:etc..."};
		Dmart.getVegatables(vegatables);// list of arguments i.e (vegatables) can be differrent but data type should be same.
		 
		// line number 8 to 11 and 14 to 17 both statements can run..
		/* System.out.println("Welcome	to	Vegatables Section"); 
		String[] organicvegatables  ={"1:Tomato", "2:Potato", "3:Beans", "4:Lady`s Finger", "5:Onion", 
		"6:Capsicum", "7:Cauliflower", "8:Beetroot", "9:Pumpkin", "10:Carrot", "11:etc..."};
		Dmart.getVegatables(organicvegatables);/ / list of arguments i.e (vegatables) can be differrent but data type should be same.
		*/ 
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 		
		System.out.println("Welcome to the Biscuits Section");
		String	biscuits [] ={"1:Britannia", "2:Sunfeast", "3:Priya Gold", "4:Anmol", "5:Unibic biscuits", 
	    "6:Parle G", "7:Patanjali ", "8:Oreo", "9:Haldiram's Biscuit", "10:Dukes Biscuit", "11:etc..."};
		Dmart.getBiscuits(biscuits);
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 		
		System.out.println("Welcome to the perfumes Section");
		String	perfumes [] ={"1:Fog", "2:PearkAvenue", "3:Elizabeth Taylor", "4:Tommy Hilfiger", "5:Denver", 
	    "6:Wild Stone", "7:Engage ", "8:Nivea", "9:Axe", "10:Davidoff ", "11:etc..."};
		Dmart.getPerfumes(perfumes);
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 
		System.out.println("Welcome	to Fruits Section");
		String fruitsType []={"1:Apples","2:Bananas","3:Cucumbers","4:Dates","5:Dragon Fruit",
		"6:Grapes","7:Kiwi","8:Lemon","9:Orange","10:Mango","11:etc..."};
		Dmart.getFruits(fruitsType);
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 
		System.out.println("Welcome to Dress/Cloth Section");
		String dressBrand [] ={"1:Lee", "2:Arrow", "3: Puma", "4:Netplay", "5:Louis Phillippe", "6:Tommy Hilfiger", 
		"7: U.S. Polo", "8:Raymonds", "9:John Player", "10:Peter England", "11: etc..."};
		Dmart.getDress(dressBrand);
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 
		System.out.println("Welcome to Shoes Section");
		String	shoesBrand [] ={"1:Nike", "2:ASSAIN", "3:Puma", "4:Fila", "5:Wood Land", 
		"6:Paragon", "7:Red Tape", "8:Crocs", "9:VKC Pride", "10:Liberty", "11:etc..."};
		Dmart.getShoes(shoesBrand);
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 
		System.out.println("Welcome to Necessary Goods Section");
		String	necessaryGoodsDaily [] ={"1:Rice", "2:Flour", "3:Dals", "4:Sugar", "5:Oil", 
	    "6:Salt", "7:Masala Powder", "8:Besan", "9:Maida", "10:Sooji/Rava", "11:etc..."};
		Dmart.getNecessaryGoods(necessaryGoodsDaily);
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 
		System.out.println("Welcome to Meat and Seafood Section");
		String	meatType [] ={"1:Fish", "2:Prawns", "3:crab", "4:Veal", "5:Chicken", 
	    "6:Turkey", "7:Mussels", "8:Duck Eggs", "9: Beef", "10:Chicken Eggs", "11:etc..."};
		Dmart.getMeat(meatType);
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 
		System.out.println("Welcome Food Section");
		String	foodsType [] ={"1:Greek yogurt", "2:Rava Upma", "3:Poha", "4:Semiya Upma", "5:Rava IdlParle", 
	    "6:Besan Chilla", "7:Rava Dosa", "8:Omelette", "9:Dosa Pesarattu", "10:Moong Dal Dosa", "11:etc..."};
		Dmart.getFoods(foodsType);	
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------");
		System.out.println("Welcome Chocolates Section");
		String	chocolateType [] ={"1:Dairy Milk", "2:Perk", "3:5-Star", "4:Fuse", "5:Melody", 
	    "6:Snickers", "7:Lacto King", "8:Eclairs", "9:Amul", "10:Lotus", "11:etc..."};
		Dmart.getChocolate(chocolateType);
		
		System.out.println("--------------------------------"); 		
		System.out.println("--------------------------------"); 
		System.out.println("Welcome Books Section");
		String	booksType [] ={"1:Dairy Book", "2:Dictionary", "3:War and Peace", "4:The Shiva Trilogy", "5:", 
	    "6:Snickers", "7:Lacto King", "8:Eclairs", "9:Amul", "10:Lotus", "11:etc..."};
		Dmart.getBooks(booksType);
		System.out.println("---------------------------------"); 		
		System.out.println("---------------------");
		
	}
}
