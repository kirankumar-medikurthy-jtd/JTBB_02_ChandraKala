let ar1 = [1, 5, 10, 20, 40, 80] ;
let ar2 = [6, 7, 20, 80, 100] ;
let ar3 = [3, 4, 15, 20, 30, 70, 80, 120];
let bag="";
let bag1="";
//Output: 20, 80
	  for(let i=0;i<ar1.length;i++)
	  {
	 	 for(let j=0;j<ar2.length;j++)
		  {
		 	 if(ar1[i]==ar2[j])
			  {
			  bag+=ar1[i]+" ";
			  }
		  }
	  	for(let k=0;k<ar3.length;k++)
	  	{
	  		if(ar1[i]==ar3[k])
	  		{
	  		bag1+=ar1[i]+" ";
	  		}
	  	}
  	}
  	if(bag==bag1)
  	{
  	console.log(bag);
  	
  	}
