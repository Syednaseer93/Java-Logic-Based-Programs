package stdexample;

public class MaxNumberInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("The maximum value is the given array is: "+max);

	}

}