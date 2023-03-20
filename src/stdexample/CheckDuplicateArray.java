package stdexample;

public class CheckDuplicateArray {

	public static void main(String[] args) {
		String str[]= {"JAVA","PYTHON","SELENIUM" ,"JAVA"};
		boolean flag=false;
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("Duplicate element found:"+str[i]);
					flag=true;
				}
			}
		}
			  
  if(flag==false)
  {
	  System.out.println("Duplicate element not found");
  }
	}

}
