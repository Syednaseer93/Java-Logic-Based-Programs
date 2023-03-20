package stdexample;

public class CountEvenOddArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,6,2,5,9};
		int n=a.length;
		System.out.println("Even numbers present are: ");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Even numbers present are: ");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		
		

	}

}
