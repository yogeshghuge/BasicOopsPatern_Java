class Demoinitalizer
{
	static //static block calls only onces
	{
		System.out.println("Static block called");
	}
	{
		System.out.println("Instance block called");
	}
	Demoinitalizer()
	{
		System.out.println("Default constructor called");
	}
}

	
	