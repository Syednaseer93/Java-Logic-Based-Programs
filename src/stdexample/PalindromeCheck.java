package stdexample;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number to Check: ");
		int num=s.nextInt();
		int orgnum=num;
		int rev=0;
		while(num!=0) {


			rev=rev*10+num%10;
			num=num/10;
		}
		if(orgnum==rev)	
		{
			System.out.println("This is a PALINDROME NUMBER : "+orgnum);
		}
		else
		{
			System.out.println("This is not a PALINDROME NUMBER..Please check with other number");
		}






	}

}


