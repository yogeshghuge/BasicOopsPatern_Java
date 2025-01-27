class DemoCopyConst
{
	DemoCopyConst(DemoCopyConst d1)
	{
		a=d1.a;
		b=d1.b;
	}
	DemoCopyConst() {}
	int a,b;
	void display()
	{
		System.out.println("A="+a+" B="+b);
	}
	public boolean equals(DemoCopyConst d1)
	{
		if(a==d1.a)
			if(b==d1.b)
				return true;
		return false;
	}
}