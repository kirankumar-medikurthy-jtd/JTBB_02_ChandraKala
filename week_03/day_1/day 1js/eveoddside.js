//Given an array of number rearrange the array according to below example
//Input : Array = [2,3,4,6,5,1,8]
//Output : Array = [2,4,6,8,3,5,1]
	let arr = [2,3,4,6,5,1,8];
	let bag="";
	let bag1="";
	for(let i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
		bag+=arr[i]+" ";
		}
	}
	//console.log(bag);
	for(let i=0;i<arr.length;i++)
	{
		if(arr[i]%2==1)
		{
		bag1+=arr[i]+" ";
		}
	}
	console.log(bag,bag1);
	
