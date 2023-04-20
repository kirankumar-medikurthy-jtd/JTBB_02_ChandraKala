//Write a program to Convert Integer  into  a Binary?
let a=5;
var binary ='';
	while(a>0)
	{
		 binary=(a%2)+ binary;
		 a =Math.floor(a/2);
	}
	
	console.log(binary);
	console.log(binary);
