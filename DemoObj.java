class DemoObj
{
	int a,b;
	void display()
	{
		System.out.println("a="+a+" b="+b);
	}
	public boolean equals(DemoObj d1)
	{
		if(a==d1.a)
			if(b==d1.b)
				return true;
		return false;
	}
}
		

			
		 	