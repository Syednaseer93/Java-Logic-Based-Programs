package stdexample;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		int count=0;
		int num=45568921;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
