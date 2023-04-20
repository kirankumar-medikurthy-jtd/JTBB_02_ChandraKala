//Write a program to generate all the substring  present in a string?
//Example : input : “bootcamp”;
                // Output : 10
		let str="bootcamp";
		let count=0
		let bag="";
	for(let i=0;i<str.length;i++)
	{
		for(let j=i;j<str.length;j++)
		{
		count++;
		bag+=str[i];
		}
	}
	console.log(bag);
	console.log(count);
	
