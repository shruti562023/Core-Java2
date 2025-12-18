package PracticesofTextFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
	
	public static void main(String[] args) throws IOException {
		
	FileReader f =new FileReader("D:\\IO\\MyFolder\\FileAcessInfo.txt");
	
	int i=f.read();
	
	while(i!=-1) {
	
		System.out.print((char) i);
		
		i=f.read();
	}
	

	
	f.close();
	}

}
