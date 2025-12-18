package PracticesOfBinaryFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextInputStream {
	
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream f = new FileInputStream("D:\\IO\\MyFolder\\cartoon.jpg");
		
		int b=f.read();
		
		while(b!=-1) {
			System.out.println( b);
			b=f.read();
		
		}
		
	f.close();
	
	}

}
