//Write a program to print “N” Traversal  elements present in an array?
//Example : Input  :
		let arr= [[1, 3,  4],
                          [6 ,3 ,2],
                          [9, 2 ,10]] ;
                                                  
 // Output :  9 6 1 3 10 2 4
    let bag ="";
 	for(let i=0;i<arr.length;i++)
 	{
 		bag+=arr[i][0]+" ";
 	}
 	//console.log(bag);
 	for(let i=1;i<arr.length-1;i++)
 	{
 		bag+=arr[i][1]+" ";
 	}
 	//console.log(bag);
 	for(let i=arr.length-1;i>=0;i--)
 	{
 		bag+=arr[i][2]+" ";
 	}
 	console.log(bag);
 	
 	


