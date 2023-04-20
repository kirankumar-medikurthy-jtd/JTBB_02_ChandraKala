//Write a program to check whether a given number is prime or not?
let num=145;
let factor=0;
for(let i=1;i<=num;i++)
{
	if(num%i==0)
	{
	factor++;

	}
	}
if(factor==2)
{
console.log(num,"prime");
}else{
console.log(num,"not prime");
}



