class MainCopyConst
{
	public static void main(String args[])
	{
		DemoCopyConst d1=new DemoCopyConst();
		d1.a=10;
		d1.b=20;
		DemoCopyConst d2=new DemoCopyConst();
		d1.display();
		d2.display();
		System.out.println(d1==d2);
		System.out.println(d1.equals(2));
	}
}