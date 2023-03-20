package stdexample;

public class CountEvenAndAddNumbers {

	public static void main(String[] args) {
		int num=123456;
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			int rem=num%10; //rem will be the last digit of a number ie 6
			if(rem%2==0) //
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;//number becomes 12345 and again goes into while loop
		}
		System.out.println("Total Even Numbers in the given number are: "+evencount);
		System.out.println("Total Odd Numbers in the given number are: "+oddcount);

		
	
		

	} 

}
