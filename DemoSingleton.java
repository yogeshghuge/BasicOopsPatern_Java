class DemoSingleton
{
	private static DemoSingleton d1=new DemoSingleton();
	private DemoSingleton(){}
	int a,b;
	void display()
	{
		System.out.println("A="+a+" B="+b);
	}
	public boolean equals (DemoSingleton d1)
	{
		if(a==d1.a)
			if(b==d1.b)
				return true;
		return false;
	}
	public static DemoSingleton getObject()
	{
		return d1;
	}
} 
	