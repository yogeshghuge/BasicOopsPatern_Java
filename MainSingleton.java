class MainSingleton
{
	public static void main(String args[])
	{
		DemoSingleton d1=Dem oSingleton.getObject();
		DemoSingleton d2=DemoSingleton.getObject();
		d1.display();
		d2.display();
		System.out.println(d1==d2);
	}
}