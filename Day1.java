

import  java.util.*;
class Day1 
{
      public static void main(String arg[])
   {
    	int i=0;
	Scanner sc =new Scanner(System.in);
	System.out.println( "Enter the character ");
	
	char ch = sc.next();
	if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'||ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U')
        {
	System.out.println("vowel");
            }
              
	else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	 {
		System.out.println("consonant");
                    }
	else
	System.out.println("invalid input");
   }
}