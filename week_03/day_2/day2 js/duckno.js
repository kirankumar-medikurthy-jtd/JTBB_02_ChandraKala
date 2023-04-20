let num="3453";
let factor=true;
	for(let i=0;i<num.length;i++)
	{
		if(num[0]==0)
		{
			factor=true;
		}else{
			factor=false;
		}
	}
	
	if(factor=true)
	{
		console.log("Not Duck");
	}else
	{
		console.log("Duck");
	}
