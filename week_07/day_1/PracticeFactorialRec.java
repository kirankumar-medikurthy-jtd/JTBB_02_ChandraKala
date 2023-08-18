//factorial number positive number
class PracticeFactorialRec
{
	public static int factorialRec(int num,int fact)
	{
		if(num == 0)
		{
			return fact;
		}
			fact = fact * num;
		return factorialRec(--num,fact);
	}
	public static void main(String[] arg)
	{
		int num = 5;
		int fact = 1;
		System.out.println(factorialRec(num,1));
	}
}
	

