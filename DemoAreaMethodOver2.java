class DemoAreaMethodOver2
{
	int a,b;
	double r;
	void area()
	{
		System.out.println("Welcome to Program");
	}
	double area(double r)
	{
		this.r=r;
		double pie=3.14,ans;
		 ans=pie*r*r;
		return ans;
	}
	int  area(int a, int b)
	{
		this.a=a;
		this.b=b;
		int ans=a*b;
		return ans;
	}
	int area(int a)
	{
		this.a=a;
		int ans=a*a;
		return ans;
	}
}