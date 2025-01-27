class WamFirstToLast
{
	int shiftFirstToLastDigit(int n)
	{
		int first=0, temp=n, count=-1;
		while(temp !=0)
		{
			first=temp%10;
			temp/=10;
			count++;
		}
		n%=Math.pow(10,count);
		n*=10;
		n+=first;
		return n;
	}
}
	