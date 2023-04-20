let str="a3b4j5";
let bag="";
	for(let i=0;i<str.length;i++)
	{
	let num=str[i+1];
		for(let j=0;j<num;j++)
		{
		bag+=str[i];
		}
	}
	console.log(bag);
	
