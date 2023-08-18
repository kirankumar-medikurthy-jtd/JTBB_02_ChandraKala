/*class fibonocciRec {
   // public static int fibonacciRec(int )
    public static void main(String[] args) {
      int  num1 = 0,num2 =1,count = 10;
        int num =0;
        for(int i=2;i<count;i++)
        {
           num = num1 + num2;
           num1 = num2;
           num2 = num;
           
        }
        System.out.println(count + " " + num2 );
           
        
    }
}
*/
class fibonocciRec
{

	public static void fibRec(int range,int a,int b)
	{
		if(a+b > range)
		{
			return;
		}
		System.out.println(a+b);
		fibRec(range,b,a+b);
	}
	
	public static void main(String []arg)
	{
		int a = 0;
		int b = 1;
		int range = 20;
		/*System.out.println(fibRec(20,0,1));*/
		
		fibRec(20,0,1);
	}

}
	
	


