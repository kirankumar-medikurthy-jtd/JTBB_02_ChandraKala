// find the length of a string
	class stringLengthRec
	{
		public static int stringLen(String str,int count)
		{
			if(count == str.length())
			{
				return count;
			}
				return stringLen(str,count + 1);
		}
		
		public static void main(String[] args)
		{
		  String str = "jtd";
		  int count = 0;
		  System.out.println(stringLen(str,0));
		}
	}
		
	
	
