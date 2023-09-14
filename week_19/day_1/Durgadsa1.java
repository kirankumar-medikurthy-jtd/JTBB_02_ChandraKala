///1.Write a program to check if the sum of maximum and minimum elements present in an array is even number or odd number?
//Example : input :Array = [3,8,19,3,2,7,6], output :“odd number”

/*class HelloWorld {
    public static void main(String[] args) {
        int[] arr= {3,8,19,3,2,7,6};
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
       
        for(int i=0;i<arr.length;i++)
        {
        if(arr[i] > max)
        {
            max = arr[i];
        }
        if(arr[i] < min)
        {
            min = arr[i];
        }
    }
        // System.out.println(max);
        // System.out.println(min);
         int sum = max + min;
        
         if (sum % 2 == 1)
         {
             System.out.println("Odd");
         }else{
             System.out.println("Even");
         }



//2.Write a program to print the occurrence of every element present in an array?
//Example : input : [2,5,6,5,6,9,9,7,2,9]
//Output : 2 : 2, 5 : 2, 6 : 2, 9 : 3, 7 : 1
class HelloWorld {
    public static void main(String[] args) {
        int []arr = {2,5,6,5,6,9,9,7,2,9};
        int[] res = new int[1000];
        for(int i=0;i<arr.length;i++)
        {
            res[arr[i]] +=1;
        }
       //System.out.println(res);
       for(int j= 0;j<res.length;j++)
       {
           if(res[j] > 0)
           {
               System.out.println(j + " " + res[j]);
           }
           
       }
       
       
    }
}
        
        
    }
}

//3. sorting
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {2,8,6,5,9,4,7};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
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
// 4.adding to 2 arrays
class HelloWorld {
    public static void main(String[] args) {
       int [][] arr= {{1,2,3}, 
                     {4,5,6},       
                     {7,8,9}};
                     
     int [][] arr2 = {{9,8,7},
                     {6,5,4},
                     {3,2,1}};
    // for(int i=0;i<arr.length;i++)
    // {
    //     for(int j=0;j<arr.length;j++)
    //     {
    //     }
    // }
    //   for(int i=0;i<arr2.length;i++)
    // {
    //     for(int j=0;j<arr2.length;j++)
    //     {
    //         System.out.print(arr[i][j] + " + " +""+arr2[i][j] + " = ");
    //         System.out.println( arr[i][j] + arr2[i][j]);
    //     }
    // } (or)
    
    int[][] res = new int[3][3];
    for(int i=0;i< 3;i++)
    {
        for(int j=0;j<3;j++)
        {
            res[i][j]= arr[i][j] + arr2[i][j];
            System.out.println(res[i][j]);
        }
    }
    }
}








//5. Write a program to replace 0’s with 1’s and 1’s with 0’s in a 2D Array?
// Example : input : [[1,1,0],[0,0,1],[1,0,1]]
// Output : [[0,0,1],[1,1,1],[0,1,0]]
class HelloWorld {
    public static void main(String[] args) {
    int[][] arr =   {{1,1,0},
                   {0,0,1},
                   {1,0,1}};
                   for(int i=0;i<arr.length;i++)
                   {
                       for(int j= 0;j<arr.length;j++)
                       {
                           if(arr[i][j] == '0)
                           {
                               arr[i][j] = 1;
                           }else if(arr[i][j] == 1)
                           {
                               arr[i][j] = 0;
                           }
                       }
                   }
                   for(int i=0;i<arr.length;i++)
                   {
                       for(int j=0;j<arr.length;j++)
                       {
                           System.out.println(arr[i][j]);
                       }
                   }
                  System.out.println();
    }
    
}*/
