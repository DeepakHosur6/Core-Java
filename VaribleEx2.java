class VariableEx2{
//For static varibles Declaration...
		static	String	name;
		static	int age;
		static	boolean isalive;
		//static	long	contact;
	 
	public static void main (String args[])
	{
// Initialization varibles as local varibles
		name="Alex";
		age=44;
		isalive=true;
		long	contact=22102221022l;
		System.out.println("Main Method	before Declaration	");
		
		System.out.println("Main Started	");
		System.out.println("Name of Patient	:"+name);
		System.out.println("Age	of Patient	:"+age);
		System.out.println("Patient Condition:"+isalive);
		System.out.println("Contact	Number :"+contact);
		System.out.println("Main Ended--------------");

		System.out.println("Main After	Declaration	");	
		name="Alex";
		age=44;
		isalive=true;
		long	contact=22102221022l;
		
	}
}