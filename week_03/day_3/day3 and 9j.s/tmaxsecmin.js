//let thrd largest sec min
	let arr=[];
	let max=-Infinity;
	let secmax=arr[0];
	let thirdmax=arr[0];
	

	for(let i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
		secmax=max;
		max=arr[i];
		}else{
		if(arr[i]>secmax)
		{
		thirdmax=secmax;
		secmax=arr[i];
		}else if(arr[i]>thirdmax){
		thirdmax=arr[i];
		}
		}
	}
	console.log(max);
	console.log(secmax);
	let min=Infinity;
	let secmin=Infinity;
	for(let i=0;i<arr.length;i++)
	{
		if(arr[i]<min)
		{
		secmin=min;
		arr[i]=min;
		}else{
			if(arr[i]<secmin)
			{
			secmin=arr[i]
			}
	}	}
	console.log(min);
	console.log(secmin);
