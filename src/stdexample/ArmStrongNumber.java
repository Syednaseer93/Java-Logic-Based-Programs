package stdexample;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int num=153; int len=0;
		int t1=num;
		while(t1!=0) // JUST TO CHECK LENGTH
		{
			t1=t1/10;
			len=len+1;
		}
		int t2=num; int reminder; int armstrong=0;
		while(t2!=0)
		{
			reminder=t2/10;
			int mul=1;
			for(int i=0;i<=len;i++)
			{
				mul=mul*reminder;
			}
			armstrong=armstrong+mul;
			t2=t2/10;
		}
			if(num==armstrong)
			{
				System.out.println("Armstrong number");
			}
			else
			{
				System.out.println("Not an Armstrong");
			}

	}

}
