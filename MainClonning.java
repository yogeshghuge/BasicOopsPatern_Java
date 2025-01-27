class MainClonning
{
	public static void main(String args[])
	{
		DemoClonning d1=new DemoClonning();
		d1.a=10;
		d1.b=20;
		DemoClonning d2=d1.clone();
		d1.display();
		d2.display();
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}
}
