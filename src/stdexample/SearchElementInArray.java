package stdexample;

public class SearchElementInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int search_ele=7;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search_ele)
			{
				System.out.println("Element found at index :"+i);
				flag=true;
				break;

			}


		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}


	}

}
