package PracticesofTextFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextBufferedReader {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader b =new BufferedReader(new FileReader("D:\\IO\\MyFolder\\FileAcessInfo.txt"));
		
		String s=b.readLine();
		
		while(s!=null) {
			System.out.println(s);
			
			s=b.readLine();
		}
		b.close();
	}

}
