/*Write a Java class with a method named calculate that is overloaded to handle different types of input:
A version that takes two int arguments and returns their sum.
A version that takes two double arguments and returns their sum.
A version that takes three int arguments and returns their sum.
A version that takes an array of int and returns their sum.
*/

class DemoCalGpt1
{
	int calculate(int a, int b)
	{
		return a+b;
	}
	double calculate(double a, double b)
	{
		return a+b;
	}
	int calculate(int a, int b, int c)
	{
		return a+b+c;
	}
	int calculate(int[] numbers) 
	{
        	int sum = 0;
        	for (int number : numbers)
		 {
            		sum += number;
       		 }
       		 return sum;
	}
}