class WamSum
{
	int rem,sum;
	int sumOfDigit(int n)
	{
		while(n>0)
		{
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}
}
		