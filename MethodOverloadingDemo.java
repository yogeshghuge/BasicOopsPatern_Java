class MethodOverloadingDemo
{
	int a;
	void m1()
	{
		System.out.println("no arg m1 method called");
	}
	void m1(int a)
	{
		System.out.println("int arg m1 method called");
	}
	void m1(int a, int b)
	{
		System.out.println("int int arg m1 method called");
	}
}