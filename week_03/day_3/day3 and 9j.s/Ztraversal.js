//Write a program to print “Z” Traversal  elements present in an array?
//Example : Input  : 
				let arr=[[1, 3 , 4],
                                         [6 ,3 ,2],
                                         [9 ,2 ,10]] ;                        
                                          // Output :  1 3 4 3 9 2 10
                                          let bag="";
                                 
                                  
                                  for(let j=0;j<arr.length;j++)
                                  {
                                  
                                  bag+=arr[0][j];

                                  }
                                         console.log(bag);
                                  
		                          for(let j=1;j<arr.length-1;j++)
		                          {
                                  
		                          
		                          
		                          bag+=arr[1][1];
		                          
		                          
                                  }
                                         console.log(bag);
                              	for(let j=0;j<arr.length;j++)
                              	{
                              	bag+=arr[2][j];
                              	} 
                                   console.log(bag);
                                  

                                  
