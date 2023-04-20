let str="heart";
let str1="earth";
let bag="";
	for(let i=0;i<str.length;i++)
	{
	for(let j=0;j<str1;j++)
	{
		if(str[i]==str1[j])
		{
		bag+=str1[j];
		}
	}
	
	if(bag==str[i])
	{
	console.log(" anagram");
	}else{
	console.log("not anagram");
	}
	}
