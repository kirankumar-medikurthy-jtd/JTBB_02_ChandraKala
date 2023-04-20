//Write a program to count all vowels and consonants present in a string?
//Example : input : “jtbfoundation”
                // Output : 4
                let str="jtbfoundation";
              //  let factor=0;
                let consonant=0;
                let vowel=0;
                for(let i=0;i<str.length;i++)
                {
               		 if(str[i]=="a" || str[i]=="e" || str[i]=="i" || str[i]=="o" || str[i]=="u")
               		 {
               		 consonant++;
               		 }else{
               		 vowel++;
               		 }
               	}
               //	console.log(factor);
               	console.log(vowel);
               	console.log(consonant);
                
                

