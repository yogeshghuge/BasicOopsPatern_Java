class DemoConst1
{
	int a,b;
	int sum,add;
	DemoConst1()
	{
		a=10;
		b=20;
		sum=a+b;
		System.out.println("Default constructor called");

	}
	DemoConst1(int a,int b)
	{
		this.a=a;
		this.b=b;
		int add=a+b;
		System.out.println("Paramterized constructor called");
		System.out.println("addition of no="+add);
	}
	void display()
	{
		System.out.println("Addition of number="+sum);
	}
}
		
		
	
