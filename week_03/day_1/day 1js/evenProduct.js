//Write a program to calculate a product of all even numbers present in an array?

let arr=[2,4,3,7,1,9];
let pro=1;
	for(let i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
		pro*=arr[i];

		}

	}
		console.log(pro);
