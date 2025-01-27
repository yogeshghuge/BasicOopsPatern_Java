class DemoAnonymous
{
	int a,b;
	void display()
	{
		System.out.println("A="+a+" B="+b);
	}
	public boolean equals(DemoAnonymous d1)
	{
		if(a==d1.a)
			if(b==d1.b)
				return true;
		return false;
	}
}