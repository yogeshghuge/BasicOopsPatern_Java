class WamRev
{
	int rem,rev;
	int reverseOfDigit(int n)
	{
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
