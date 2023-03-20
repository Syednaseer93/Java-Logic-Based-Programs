package stdexample;

import java.util.Arrays;

public class BubbleSortArray {

	public static void main(String[] args) {
		int a[]= {5,1,4,6,3,2};
		int n=a.length;
		System.out.println("Array before sorting: "+Arrays.toString(a));
		for(int i=0;i<n-1;i++) // for each and every pass
		{
			for(int j=0;j<n-1;j++)//for itertating inside every pass 
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting: "+Arrays.toString(a));
	}
}
