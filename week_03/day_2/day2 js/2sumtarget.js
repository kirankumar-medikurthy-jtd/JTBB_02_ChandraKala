//Write a program to check to print indices of two numbers present in an array, whose sum is equal to target value ?
            // Example : input  : Array = [2,3,4,6,8,1];     Target : 10
                                        //  Output = 2,3
                                        let arr=[2,3,4,6,8,1];    
                                        let target =10;
                                        let a=0;
                                        let b=0;
                                        for(let i=0;i<arr.length;i++)
                                        {
                                       		 for(let j=i;j<arr.length-1;j++)
                                       		 {
		                               		 if(arr[i]+arr[j]==target)
		                               		 {
		                               		 a=i;
		                               		 b=j;
		                               		 }
                                       		 }
                                       	 }
                                       		 
                                       		 console.log(a,b)
                                        
                                        
                                       

