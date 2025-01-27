class ConstDemo
{
	ConstDemo()
	{
		a=10;
		b=20;
		System.out.println("Default consturctor called");
	}
	ConstDemo(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Int int arg para constructor called");
	}
	int a,b;
	void display()
	{
		System.out.println("a="+a+" b="+b);
	}
	
}

	