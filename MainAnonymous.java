class MainAnonymous
{
	public static void main(String args[])
	{
		DemoAnonymous d1=new DemoAnonymous();
		d1.a=10;
		d1.b=20;
		d1.display();
		new DemoAnonymous().a=10;
		new DemoAnonymous().display();
	}
}