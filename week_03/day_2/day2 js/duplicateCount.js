//Write a program to  Count all duplicate elements present in an array?
    let arr=[1,2,3,4,1,24,2,3]; 
    let obj={};
    	for(let i=0;i<arr.length;i++)
    	{
	    if(obj[arr[i]]==undefined)
	    {
		    obj[arr[i]]=1;
		    }else{
		    obj[arr[i]]++;
		    }
       }
    	//console.log(obj);
 
    	for(let key in obj){
	    	if(obj[key]>1)
	    	{
	       	 console.log(key +"=>"+obj[key]);   	
	    	}
	    
	 }

