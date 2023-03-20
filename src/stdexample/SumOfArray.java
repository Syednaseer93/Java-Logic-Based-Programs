package stdexample;

import java.util.Scanner;

public class SumOfArray {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n =s.nextInt();
		int nums[]=new int[n];
		
		for(int i=0;i<nums.length;i++)
		{
			nums[i]=s.nextInt();
		}
		
	}

}
