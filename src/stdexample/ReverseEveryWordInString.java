package stdexample;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		String str= "GNIK DEYS REESAN"; //MAIN STRING WHICH IS TO BE REVERSED
		String words[]=str.split(" "); //NOW THIS WILL BECOME STRING ARRAY String words[]={"GNIK","DEYS","REESAN"}; with the help of split method
		String reversestring ="";  //THE FINAL STRING WHICH IS TO REVERSED , KEEP IT EMPTY AS OF NOW
		for(String w:words)  //NOW EVERY WORD FROM STRING ARRAY WILL BE STORED IN VARIABLE w. AND ONE WORD WILL BE RETRIVED AND SENT INSIDE INNER FORLOOP
		{                             //. .WHERE THAT WORD WILL BE REVERSED AND STORED INSIDE  reverseword VARIABLE  AND NEXTWORD WILL BE TAKEN IN..
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseword=reverseword+w.charAt(i);//STORES THE REVERSED WORD 
			}

			reversestring=reversestring+reverseword+" ";//3 REVERSED WORD WILL BE CONCATINATED NEXT TO EACHOTHER AS THIS IS INSIDE FOREACH LOOP
		}
		System.out.println("The reversed string :"+reversestring);

	}

}

