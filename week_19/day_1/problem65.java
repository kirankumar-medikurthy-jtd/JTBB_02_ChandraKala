// 1.problem


/*public class main
{
    public static void main(String[] args)
    {
        int n=0,n1=1,n2, count =5;
        System.out.println(n);
        
        for(int i=2;i<=count;i++)
        {
            n2 =n +n1;
            
            System.out.println(n2);
            n = n1;
            n1 = n2 ; // updating the values
        }
    }
}


2./// sum of the digits in a number
public class main
{
    public static void main(String [] args)
    {
        int num = 13;
        int sum =0;
        while(num >0)
        {
            int digit = num%10;
            sum+=digit;
             num/=10;
        }
            System.out.println(sum);
    }
}

3.A number is armstrong or not 

class HelloWorld {
    public static void main(String[] args) {
        int num = 153;
        String str=""+num;
        int sum =0;
        int number = num;
        while(num>0)
        {
            int temp = num%10;
            sum +=Math.pow(temp,str.length());
            num /=10;
        }
       
        if(sum == number)
        {
             System.out.println("s");
        }
        else
        {
             System.out.println("no");
        }
    }
}

4 .// Write a program to find the factorial of a number N.

class main
{
    public static void main(String[] args)
    {
        int num = 5;
        int fact = 1 ;
        for(int i=1;i<=num;i++)
        {
            fact = fact * i;
            
        }
        System.out.println(fact);
    }
}

5.// Write a program to check whether the given number is a prime number or not.
        class main
        {
            public static void main(String[] args)
            {
                int num = 19;
                int fact = 0;
                for(int i=2;i<num;i++)
                {
                    if(num%i==0)
                    {
                        fact ++;
                        break;
                    }
                }
                if(fact == 0)
                {
                    System.out.println("prime");
                }else{
                    System.out.println("not prime");
                }
            }
        }

//6. reverse string
 class main
    {
        public static void main(String[] args)
        {
            String str = "chandhu";
            String bag = " ";
            for(int i=str.length()-1;i>=0;i--)
            {
                bag += str.charAt(i); 
            }
            
              System.out.println(bag);
        }
    }

7.///Write a program to check whether a string is palindrome or not. // 
   
   class main 
   {
       public static boolean palindrom(String str,int start,int end)
       {
           if(start >=  end)
           {
               return true;
           }
           if(str.charAt(start) != str.charAt(end))
           {
               return false;
           }
         return palindrom(str,++start,--end);
       }
       public static void main(String[] args)
       {
            String str ="mame";
           int start = 0;
           int end = str.length()-1;
          
           System.out.println(palindrom(str,start,end));
       }
   }
    
    8.// Write a program to swap two numbers using extra memory and without extra memory.
public class main
{
    public static void main(String[] args)
    {
        int a = 4;
        int b = 2;
       
       // using extra memory
      int temp = a;
      a = b;
      b = temp;
        System.out.println(a + " " + b);
        
        //without using extra memory
         a = a + b;
         b = a - b;
         a = a - b;
         System.out.println(a + " " + b);
         
        
    }
}
	9.////Write a program to sum all the elements present in an array.
    
    class main
    {
        public static void main(String[] args)
        {
            int sum = 0;
            int[] arr = {2,5,3};
            for(int i=0;i<arr.length;i++)
            {
                sum += arr[i];
            }
            System.out.println(sum);
        }
        
    }
    
    10.//Write a program to check if the sum of two numbers in an array is equal to the target value.

    class main
    {
        public static void main(String[] args)
        {
            int[] arr= {2,4,6,7,9};
            int target = 10;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr.length;j++)
                {
                     if(arr[i] + arr[j] ==  target)
                     {
                         System.out.println(arr[i]);
                     }
                }
            }
        }
    }
   //11. //Write a program to sum of the diagonal elements present in an 2D array.

class HelloWorld {
    public static void main(String[] args) {
        
       int [][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
                        int bag = 0;
                        int sum = 0;
        for(int i =0;i<arr.length;i++)
        {
            if(i == i)
            {
                bag+= arr[i][i] ;
            }
        }
        System.out.println(bag);
        System.out.println("====== ****** ======");
         int bag2 = 0;
        for(int i=0;i<arr.length;i++)
        {
            bag2 += arr[i][arr.length-1 -i] ;
        }
        System.out.println(bag2 );
        sum = bag + bag2;
        System.out.println(sum);
    }
}

//12 .Write a program to check whether a string is anagram or not.
class problem65
{
	public static void main(String[] args)
	{
	
		String  str = "earth";
		String str1 = "hearut";
		int count1 = str.length();
		
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str1.length();j++)
			{
				if(str.charAt(i) == str1.charAt(j))
				{
					count++;
					break;
				}
			}
		}
		if(count1 == count)
		{
			System.out.print("anagram");
		}else{
			System.out.print("not anagram");
		}
	}
}
//13 .Write a program to sum the border element present in an array.
	class problem65
	{
		public static void main(String[] args)
		{
			int[][] arr = {{1,2,3},
					{4,5,6},
					{7,8,9}};
					int sum = 0;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=0;j<arr.length;j++)
				{
					sum +=arr[0][i];
				}
			}
			System.out.println(sum);
		}
	}

14. // // Write a program to find the 3rd largest element and 2nd smallest element in an array without using sorting methods.
class problem65
	{
public static void main(String[] args)
{
	int[][] arr = {{1,2,3},
			    {4,5,6},
				{7,8,9}};
			String sum = "";
			int sum1 = 0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
		//	sum +=arr[0][i] +" ";
			sum1 += arr[0][i];
			break;
		}
	}
//	System.out.println(sum1);
	int second = 0;

	for(int i=1;i<arr.length;i++)
	{
	    for(int j=0;j<arr.length;j++)
	    {
	       
	         second +=arr[i][2];
	        break;
	    }
	}
	  // System.out.print(second);
	   
	   	int  b = 0;
	   for(int k =0;k<arr.length;k++)
	   {
	       b += arr[2][k];
	   }
	   //System.out.print(b);
	   int c= 0;
	   for(int i =0;i<arr.length;i++)
	   {
	       c+=arr[1][0];
	       break;
	   }
	  // System.out.println(c);
	  System.out.println(sum1 + second + b + c);
}
	}
//15 .printing pattern
Patterns
* * * *
* *
* *
* * * *
public class SimplePattern {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = 1; i < rows; i++) {
                System.out.println("*" + "*");
                
            }
          
        // for(int j=1;j<5;j++)
        //         {
        //             System.out.println("*");
        //         }
    }
}
16.Write a program to print below pattern
* * * *
* * *
* *
*
public class problem65
{
	public static void main(String[] args)
	{
		int row = 5 ;
		for(int i=row;i>=0;i--)
		{
			for(int j=1;j<i;j++)
			{
			System.out.print("* ");
		}
		System.out.println();
		}
	
	}
}
17.Write a program to print below pattern
* * * * *
*
*
public class problem65
{
	public static void main(String[] args)
	{
		int row = 5 ;
		for(int i=1;i<row;i++)
		{
			System.out.print("* ");
		}
			for(int j=1;j<row-1;j++)
			{
			System.out.println("*");
			}
	}
}

18.Find the length of a string using recursion.


public class problem65
{

	public static int lenString(String str,int count)
	{
		if( count  == str.length())
		{
			return count;
		}
		return lenString(str,++count);
	}
	public static void main(String[] args)
	{
		String str ="abc";
		int count = 0 ;
		System.out.println(lenString(str,count));
	
	}
}
19.Find the sum of even numbers in an array using recursion.
public class problem65
{
    public static int sumOfArray(int[] arr,int sum,int i)
    {
        if(i == arr.length)
        {
            return sum;
        }
        if(arr[i]%2 == 0)
         {
             sum +=arr[i];
         }
        // sum +=arr[i];
        return sumOfArray(arr,sum,++i);
    }
    public static void main(String[] args)
    {
        int sum= 0;
        int[] arr ={2,4,6,9,1};
        int i = 0;
        System.out.println(sumOfArray(arr,0,0));
    }
}

20.check given a number is palindrom or not 


	public class problem65
 { 
 	public static boolean numPalindrom(int num, int start, int end)
 	{
 		if(start > end)
 		{
 			return true;
 		}
 		String strNum =Integer.toString(num);
 		if(strNum.charAt(start) != strNum.charAt(end))
 		{
			return false;
 		}
 		return numPalindrom(num,++start,--end);
 	}
 	
 	public static void main(String[] args)
 	{
 		int num = 124;
 		int start = 0;
 		String strNum = Integer.toString(num);
 		int end = strNum.length()-1;
 		System.out.println(numPalindrom(num,start,end));
 	}
 }

21. reverse array
class HelloWorld {
    public static void printElementsReverse(int arr[], int i) {
        if (i < 0) {
            return;
        }
        System.out.print(arr[i] + " ");
        printElementsReverse(arr, i - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 8 };
        int i = arr.length - 1;
        printElementsReverse(arr, i);
    }
}
//22.//Calculate the sum of digits using recursion.
class problem65
{
	public static int sumOfDigits(int num ,int sum)
	{
		if(num == 0)
		{
			return sum;
		}
		int digits = num%10;
		sum += digits;
		return sumOfDigits(num/10,sum);
	}
	public static void main(String[] args)
	{
		int num = 153;
		int sum = 0;
		
		System.out.println(sumOfDigits(num,0));
	
	}
}

23.//check a string is palindrom or not
class main
{
    public static void main(String[] arg)
    {
        String str = "BAB";
        System.out.println(palindrom(str));
    }
    public static boolean palindrom(String str)
    {
        int start = 0;
        int end = str.length()-1;
        while( start < end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
             start ++;
             end --;
        }
        return true;
    }
}
//24. a number is equall to square or not
class main
{
	public static void main(String[] args)
	{
		int num = 23;
		boolean flage = false;
		for(int i=0;i<=num/2;i++)
		{
			if(i*i == num)
			{
				flage = true;
				break;
			}
		}
		if(flage)
		{
		    System.out.println("yes");
		  
		}else{
		    System.out.println("no");
		}
	}
}


//25.Calculate the sum of all elements in an array using recursion.
class problem65
{
	
	public static int sumOfallElementOfArray (int[] arr ,int i,int size,int sum)
	{
		if(i == size)
		{
		return sum;
		}
		sum += arr[i];
		return sumOfallElementOfArray(arr,++i,size,sum);
	}
	public static void main(String[] args)
	{
		int[] arr = {1,12,5};
		int i = 0;
		int sum = 0;
		int size = arr.length; 
		System.out.println(sumOfallElementOfArray(arr,0,size,0));
	}
}


//26//Reverse a string using recursion.
class problem65
{
	public static String reversStr(String str,String bag,int start,int end)
	
	{
		if(start >= end)
		{
			return bag;
		}
		bag += str.charAt(end);
		return reversStr(str,start,--end,bag);
	}
	
	public static void main(String[] args)
	{
		String str  = "chandhu";
		int start = 0;
		int end = str.length()-1;
		String bag ="";
		System.out.println(reversStr(str,start,end,bag));
	}
}

//27 . reverse a string using recursion
class problem65
{
    public static String rev(String str,int start,int end,String bag)
    {
        if(start > end)
        {
            return bag;
        }
        bag += str.charAt(end);
        return rev( str,start,end-1,bag);
    }
    public static void main(String [] args)
    {
        String str ="caa";
        String bag = "";
        int start =0 ;
        int end= str.length()-1;
        System.out.println(rev(str,start,end,bag));
    }
}


28 //maximum element of the array using recursion


 class problem65
 {
 
 	public static int maxArray(int[] arr,int i,int max)
 	{
 		if(i == arr.length)
 		{
 			return max;
 		}
 		if(arr[i] > max)
 		{
 			max = arr[i];
 		}
 		return maxArray(arr,i+1,max);
 	}
 	public static void main(String[] args)
 	{
 		int [] arr = {2,4,6,7,890};
 		int i = 0;
 		int max = Integer.MIN_VALUE;
 		System.out.println(maxArray(arr,i,max));
 	}
 }
 
// 29. // sumof NaturalNumbers
 
 class problem65 {
    public static int numsum(int num,int i,int sum)
    {
        if(num <= 0)
        {
            return sum;
        }
        sum= sum+ i;
        return numsum(--num,++i,sum);
    }
    public static void main(String[] args) {
       int num = 5;
       int i =1;
       int sum = 0;
      
      
       System.out.println(numsum(num,i,sum));
    }
}

//30.sumof digits
class problem65 {
    public static int sumOfDigits(int num,int sum)
    {
        if(num == 0)
        {
            return sum;
        }
        int digits = num%10;
        sum += digits;
               num/=10;
        return sumOfDigits(num,sum);
    }
    public static void main(String[] args) {
        int num = 105;
        int sum = 0 ;
        System.out.println(sumOfDigits(num,sum));
    }
}


//31 .Write a program to check whether a string is anagram or not.
class main {
    public static void main(String[] args) {
        String str = "chandhu";
        String str2 = "indhu";
        int count =0;
        for(int i= 0 ;i<str.length() ; i++)
        {
            for(int j= 0;j<str2.length();j++){
                if(str.charAt(i) == str2.charAt(j))
                 {
                     count ++;
                 }
                
            }
        }
        if(count == str.length() && count == str2.length())
        {
        
            System.out.println("anagram");
        }else{
        System.out.println("not anagram");
        }
    }
}
32.//Calculate the sum of digits in a positive integer using recursion.
class HelloWorld {
    public static int sumOfDigits(int num,int sum)
    {
        if(num == 0)
        {
            return sum;
        }
        int digits = num%10;
            sum+= digits;
            num/=10;
        return sumOfDigits(num,sum);
    }
    public static void main(String[] args) {
        int num =1290;
        int sum = 0;
        System.out.println(sumOfDigits(num,0));
    }
}
//33 .Find the factorial of a positive integer using recursion.

public class main
{
    public static int factorialPos(int num,int fact,int i)
    {
        if(i > num) // i is greater than num means it will print  120 (fact)
        {
            return fact;
        }
        fact = fact * i;
        return factorialPos(num,fact,++i);
    }
    public static void main(String[] args)
    {
        int num = 5;
        int fact =1;
        int i = 1;
        
        System.out.println(factorialPos(num,1,1));
        
    }
}
//34.// asending or not
class HelloWorld {
    public static boolean Asending(int[] arr,int i )
    {
        if(arr.length == 0 || arr.length == 1)
        {
            return true;
        }
        if( i == arr.length-1)
        {
             return true;
        }
        if(arr[i] < arr[i + 1])
        {
        return Asending(arr, i+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
       int[] arr = {2,9,5,6};
       int i =0;
       System.out.println(Asending(arr,i));

}
}
35..removing duplicate elements
class HelloWorld {
    public static void main(String[] args) 
    {
     int[] arr = {2,4,5,4,3,3,4};
    
     for(int i = 0 ; i < arr.length ; i++)
     {
         boolean a = true;
         for(int j = 0 ; j < arr.length ; j++)
         {
             if( i != j && arr[i] == arr[j])
             {
                 a = false;
                 break;
             }
         }
         if(a)
         {
         System.out.println(arr[i]);
         }
     }
     
    }
}
36.// nth fibonacci series
class HelloWorld {
    public static void nth(int a ,int b,int range)
    {
        if(a+b > range)
        {
            return;
        }
        System.out.println(a+b);
        nth(b,a+b,range);
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int range = 10;
       nth(0,1,10);
    }
}

//37.// frequency of each element in array
public class problem65
{
    public static void main(String[] args)
    {
        int[] arr = {2,4,6,4,6,3,5};
        int[] results = new int[10];
        for(int j=0;j<arr.length;j++)
        {
            results[arr[j]] += 1;
        }
        for(int i=0;i<results.length;i++)
        {
            if(results[i] > 0)
            {
                System.out.println(i+ " " +results[i]);
            }
        }
    }
}
//38 print the pattern of below
// * * * *
// * *
// * *
// * * * *
class problem65 {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 4;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

//39.//count the words ,characters and sentences in a paragraph
class main {
    public static void main(String[] args) {
        String str = "nandhana is taking resposibility of javascript. siri taking react resposibility.";
        int characters = 0;
        int sentence = 0;
        int words = 0;
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)  == '.')
            {
                sentence++;
            }else if (str.charAt(i) != ' ')
            {
                characters++;
            }else if(str.charAt(i) == ' ')
            {
                words++;
            }
        }
       if(str.charAt(str.length() -1) != ' ')
       {
           words++;
       }
        System.out.println("sentence count : " + sentence);
        System.out.println("character count :" + characters);
        System.out.println("word count  : " + words);
    }
}
//40 . print power of numbers

 class problem65{
    public static int powerOFNumber(int base,int expo)
    {
        if(expo ==  0)
        {
            return 1;
        }else{
            return base * powerOFNumber (base,expo -1);
        }
    }
    public static void main(String[] args) {
        int base = 2;
        int expo = 3;
        System.out.println(powerOFNumber(base,expo));
    }
}
//41. Find the number of ways to climb a staircase using recursion.
class main 
{
    public static int staircase(int current,int finals)
    {
        if(current ==  finals)
        {
            return 1;
        }else if( current > finals)
        {
            return 0;
        }
        return staircase(current +1, finals) + staircase (current +2, finals);
    }
    public static void main(String[] args)
    {
        int current = 0;
        int finals = 4;
        System.out.println(staircase(current,finals));
    }
}*/
//42. Write a program to implement a stack Data Structure using array
class stackarray {
    static int top = -1;
    static int[] arr = new int[1000];
    
    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        print();
        pop();
        print();
    }
    public static void  push(int a)
    {
        if( top == arr.length-1)
        {
            System.out.println("stack is full");
            
        }else{
            top ++;
            arr[top] = a;
        }
    }
    public static void pop()
    {
        if(top == -1)
        {
            System.out.println("cannot pop with empty stack");
        }else{
            top--;
        }
    }
    public static void print()
    {
        if(top == -1)
        {
            System.out.println("empty arr");
        }else{
            System.out.println("stack elements are");
            for(int i=0;i<=top;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}


//43.// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                      {4,5,6},
                       {7,8,9}};
                       String bag= "";
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr.length;j++)
           {
               // System.out.println(arr[i][j]);
               if(i==j)
               {
                   bag += arr[i][j];
               }
           }
       }
        System.out.print(bag);
        System.out.println(" +++++ ***** +++++");
     
           for(int i=0;i<arr.length;i++)
           {
                   bag+= arr[i][arr.length -1-i];
           }
       System.out.println(bag);
       
    }
}
//44.remove the e character in string or sentence
class HelloWorld {
    public static void main(String[] args) {
     String str = "we are celebrating teachers day";
     String bag = "";
         for(int i= 0;i<str.length();i++)
         {
             if(str.charAt(i) != 'e')
                 {
                      bag += str.charAt(i);
                 }
         }
    System.out.println(bag);
    }
}
//45 bubble sort
 class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {2,4,-1,-5,0,6,8,-10};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

class HelloWorld {
    public static void main(String[] args) {
        String str = "i am not well";
        int start = 0;
        int end = 0;

        while (end < str.length()) {
            // Find the end of the current word
            while (end < str.length() && str.charAt(end) != ' ') {
                end++;
            }

            // Print the current word
            System.out.println(str.substring(start, end));

            // Move to the next word
            while (end < str.length() && str.charAt(end) == ' ') {
                end++;
            }
            start = end;
        }
    }
}







class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,7,8};
        int target = 8;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == target)
                {
                    System.out.println(arr[i]+" "+arr[j]);
                    
                }
            }
        }
        
    }
}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
       String str = " all is well .";
       int w =0 ;
       int s = 0;
       int l = 0;
       for(int i=0;i<str.length();i++)
       {
           if(str.charAt(i) == '.')
           {
               s++;
           }
           if(str.charAt(i) == ' ')
           {
               w++;
           }
           if(str.charAt(i) != ' ')
           {
               l++;
           }
          
       }
          System.out.println(s);
           System.out.println(w);
           System.out.println(l);
    }
}
