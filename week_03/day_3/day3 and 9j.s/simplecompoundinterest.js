//Write a program to calculate simple Interest(SI) and Compound Interest(CI)?
//Principle : 1000
//Rate of Interest : 15%
//Time : 3 years
//let simpleint=(p*r*t)/100;
	let p=1000;
	let r=15;
	let t=3;
	let simple=(1000*15*3)/100;
	console.log(simple);
	let compoundint=Math.floor(p*(Math.pow((1+r/100),t))-p);
	console.log(compoundint);
