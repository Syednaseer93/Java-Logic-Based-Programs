package stdexample;

public class PrimeOrNot {
	static boolean checkPrime(int n)// INPUT NUMBER TO CHECK PRIME OR NOT
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkPrime(7));
	}
}
