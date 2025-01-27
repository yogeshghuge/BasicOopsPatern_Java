class MainAreaMethodOver2 
{
	public static void main(String args[])
	{
		DemoAreaMethodOver2 d1=new DemoAreaMethodOver2();
		d1.area();
		double cri=d1.area(7.2);
		System.out.println("Area of cricle="+cri);
		int rect= d1.area(5,6);
		System.out.println("Area of rectangle="+rect);
		int sq=d1.area(12);
		System.out.println("Square of Square="+sq);
	}
}