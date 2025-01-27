class MainMethod
{
	public static void main(String args[])
	{
		try
		{
			Class c=Class.forName("DemoMethod");
			DemoMethod d1=(DemoMethod)c.newInstance();
			DemoMethod d2=(DemoMethod)c.newInstance();
			d1.display();
			d2.display();
			System.out.println(d1==d2);
			System.out.println(d1.equals(d2));
			
		}
		catch(ClassNotFoundException | InstantiationException | IllegalAccessException e)
		{
			System.out.println(e);
		}
	}
}