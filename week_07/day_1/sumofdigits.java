//calculate the sumof the digits

public class sumofdigits	
{
	public static int sumOfDigits(int num, int sum)
	{
		if(num> 0)
		{
			return sum;
		}
		return sumOfDigits(num,sum + 1);
	
	}
	public static void main (String[] args)
	{
		int num = 123;
		int sum = 0 ;
		System.out.println(sumOfDigits(num,sum));
	}
}
