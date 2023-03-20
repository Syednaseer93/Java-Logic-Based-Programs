package stdexample;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		
	   String orgstring=str;
	   String rev="";
		  
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
       System.out.println(rev);
    
       if(orgstring.equals(rev))
       {
    	   System.out.println("This is a palindrome String");
       }
    	   else
    	   {
    		   System.out.println("Not a palindrome");
    	   }
       }
	}


	