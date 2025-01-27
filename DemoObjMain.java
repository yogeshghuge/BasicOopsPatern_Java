class DemoObjMain
{
	public static void main(String args[])
	{
		DemoObj d1=new DemoObj();
		DemoObj d2=new DemoObj();
		
		d1.display();
		d2.display();
		System.out.println(d1==d2);
		System.out.println(d1.equals(d2));
	}
}