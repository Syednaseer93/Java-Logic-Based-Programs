package stdexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("c:\\SeleniumPractice\\Test123.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hi Selenium");
		System.out.println("completed");
		bw.close();
	}

}
