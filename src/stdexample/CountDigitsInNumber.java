package stdexample;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		int num=1234522222;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("total numbers available are: "+count);

	}

}
