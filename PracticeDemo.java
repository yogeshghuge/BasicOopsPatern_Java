class PracticeDemo{

//01] Finding Last Digit of a Number

	int findLastDigit(int n)
	{
		/*
		int last = n%10;
		System.out.println(last);
		return last;
		*/
		n = n%10;
		System.out.println(n);
		return n;
	}
	

//02] Finding First Digit of a Number

	int findFirstDigit(int n)
	{
		while(n>=10)
		{
			n=n/10;
		}
		System.out.println(n);
		return n;
	}
	


//03] Finding Second Last Digit of a Number	
	int findSecondLastDigit(int n)
	{
		/*
		int sec = 0;
		sec = n/10;
		System.out.println(sec%10);
		return sec;
		*/
		n = n/10;
		System.out.println(n%10);
		return n;
	}
	


//04] Finding Second Digit of a Number
	int secondDigit(int n)
	{
		//int sec = 0;
		while(n>100)
		{
			n = n/10;
		}
		//sec = n%10;
		System.out.println(n%10);
		return n;
	}


	
//05] Sum of its digits
	int sumOfDigit(int n)
	{
		int sum = 0;
		while(n>0)
		{
			sum+=n%10; //3
			n = n/10; //12
		}
		System.out.println(sum);
		return sum; 	
	}


//06] Find reverse of a given Number  
	int reverseNumber(int n)
	{
		int reverse = 0;
		while(n>0)
		{
			reverse=n%10;
			n=n/10;
			System.out.print(reverse);
		}
		return reverse;
	}

	
//07] Shifting first digit to last
	int firstToLast(int n)
	{
		int first=0,temp=n,count=-1;
		while(temp!=0)
		{
			first =temp%10;  //1=first
			temp/=10;  //temp=0
			count++;  //2
		}
		n%=Math.pow(10,count);  //123%=100 = 23
		n*=10;  //230
		n+=first; //231
		System.out.println(n); //231
		return n;
	}
	

//08] Shifting Last to first
	int lastToFirst(int n)
	{
		//123 = 312
		int last=0,temp=n,count=1;
		last= n%10; //5
		while(temp>100)
		{
			temp/=10; //12
			count++; //4
		}
		last*=Math.pow(10,count);
		n/=10;
		last+=n; 
		System.out.print(last);
		return last;
	}


//09] Shift Sum of digit at the end:
	int sumTOLast(int n)
	{
		int sum = 0,temp=n;
		while(temp>0)
		{
			sum+=temp%10;
			temp/=10;	
		}
		int temp1=sum;
		int c=0;
		while(temp1>0)
		{
			temp1/=10;
			c++;	
		}
		n*=Math.pow(10,c); 
		n+=sum; 
		System.out.println(n);
		return n;
	}



//10] Shift sum of digit at the first:
	//1234 = 101234
	int sumToFirst(int n)
	{
		int sum=0,temp=n,count=0;
		while(temp>0)
		{
			sum+=temp%10;
			temp/=10;
			count++;
		}
		sum*=Math.pow(10,count);//100000
		sum+=n; //101234
		System.out.println(sum);
		return sum;	
	}

//11] Write a Java program to check number is even or odd

	int evenOdd(int n)
	{
		System.out.println((n%2!=0)?"It is Odd Number":"It is Even Number");
		return n;
	}

//12] Write a Java program to find last digit of a number
	
	int lastDigit(int n)
	{
		System.out.println(n%=10);
		return n;
	}

//13] Write a Java program to find the first digit of a number

	int firstDigit(int n)
	{
		while(n>10)
			n=n/10;
		System.out.println(n);
		return n;
	}

//14] Write a Java program to find sum of digit of a number

	int sumOfDigit2(int n)
	{
		int sum = 0;
		while(n>0)
		{
			sum+=n%10;
			n/=10;
		}
		System.out.println(sum);
		return sum;
	}





}