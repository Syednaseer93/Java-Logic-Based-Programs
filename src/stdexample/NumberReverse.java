package stdexample;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
			
		System.out.println("The reversed number is  "+rev);

	}

}
