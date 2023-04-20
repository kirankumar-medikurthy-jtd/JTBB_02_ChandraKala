//encode 
let str="aaaadddeeeffff";
	let count=0;
	let bag="";
	for(let i=;i<str.length;i++)
	{
		count++;
		if(str[i]!=str[i+1])
		{
		bag+=str[i]+count;
		count=0;
		}
	}
	console.log(bag);
