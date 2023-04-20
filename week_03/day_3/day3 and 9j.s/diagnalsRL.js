//Write a program to calculate a  sum of left diagonal and right diagonal elements present in 2D arrays?
//let Example : Input  : 
		                        
  // Output :  27
  
  		 let arr=[[1 ,3 ,4],
                         [6 ,3 ,2],
                         [9 ,2 ,10]];
	 	 let sum=0;
		 for(let i=0;i<arr.length;i++)
		 {
			sum+=arr[i][i];
		 }
		console.log(sum);	
		let sum1=0; 
		let count=0;
		for(let j=arr.length-1;j>=0;j--)
		{
			sum1+=arr[count][j];
			 count++;
		}
		 console.log(sum1);
		console.log(sum1+sum);
