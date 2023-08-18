public class PalindromRec
{
	public static boolean reverseStr(String str, int start,int end)
	{
	
		if( start >= end)
		{
			return true;
		}
			
		if(str.charAt(start) != str.charAt(end))
		{
			return false;
		}
		return reverseStr(str,++start,--end);
	
	}
	public static void main(String[] args)
	{
		String str ="durga";
		int start = 0;
		int end = str.length()-1;
		System.out.println(reverseStr(str,start,end));
	
	}
	
	
}
