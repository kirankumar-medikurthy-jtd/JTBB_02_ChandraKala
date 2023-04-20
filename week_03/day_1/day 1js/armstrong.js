let num=1534;
let cube =num+"";
let count=0;
	for(let i=0;i<cube.length;i++)
	{
		let sum=cube[i];
	count+=Math.pow(sum,cube.length)
	}
	if(count==num){
		console.log("armstrong");
	}else{
		console.log("not armstrong");
	}
