package stdexample;

import java.util.Scanner;

public class SumOfArraySdet {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("the sum is "+sum);
	/*	for(int n:a)
		{
			sum=sum+n;
		}*/
	}

}