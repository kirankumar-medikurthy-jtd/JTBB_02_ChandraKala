 let arr =[[1,2,3,],
 	   [4,5,6],
 	   [7,8,9]];
 	  let bag ="";
 	 /*for(let i=0;i<arr.length;i++)
 	  {
 	  	bag+=arr[i][0]+ " ";
 	  }
 	  for(let i=1;i<arr.length-1;i++)
 	  {
 	  	bag+=arr[i][1]+" ";
 	  }
 	  for(let i=1;i<arr.length;i++)
 	  {
 	  	bag+=arr[i][2]+" ";
 	  }
 	  console.log(bag)*/
 	  for(let i=0;i<arr.length;i++)
 	  {
 	  	bag+=arr[i][0]+ " ";
 	  }
 	  for(let j=1;j<arr.length-1;j++)
 	  {
 	  	bag+=arr[1][j]+" ";
 	  }
 	  for(let i=1;i<arr.length;i++)
 	  {
 	  	bag+=arr[i][2]+" ";
 	  }
 	  console.log(bag);
