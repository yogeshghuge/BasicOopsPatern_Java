class MainCalGpt1
{
	public static void main(String args[])
	{
		DemoCalGpt1 d1=new DemoCalGpt1();
		System.out.println(d1.calculate(5, 3)); //  8
        	System.out.println(d1.calculate(5.5, 3.3)); //  8.8
        	System.out.println(d1.calculate(1, 2, 3)); // 6
        	int[] num = {1, 2, 3, 4, 5};
        	System.out.println(d1.calculate(num));//15
	}
}