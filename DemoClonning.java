class DemoClonning implements Cloneable
{
	int a,b;
	void display()
	{
		System.out.println("a="+a+" b="+b);
	}
	public boolean equals(DemoClonning d1)
	{
		if(a==d1.a)
			if(b==d1.b)
				return true;
		return false;
	}
	public DemoClonning clone()
	{
		DemoClonning d1=null;
		try
		{
			d1=(DemoClonning)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println(e);
		}
		return d1;
	}
}