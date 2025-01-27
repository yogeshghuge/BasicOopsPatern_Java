class DemoRefMain
{
	public static void main(String args[])
	{
		DemoRef d1=new DemoRef();
		DemoRef d2=d1;
		DemoRef d3=d2;
		d1.a=10;
		d2.b=20;
		d3.c=30;
		d1.display();
		d2.display();
		d3.display();
		System.out.println(d2==d3);
		System.out.println(d1.equals(d2));
	}
}