class DemoMethod
{
	int a,b;
	void display()
	{
		System.out.println("A="+a+" B="+b);
	}
	public boolean equals(DemoMethod d1)
	{
		if(d1.a==a)
			if(d1.b==b)
				return true;
		return false;
	}
}