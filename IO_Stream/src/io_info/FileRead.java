package io_info;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
	
	public static void main(String[] args) throws IOException {
		
		
		FileReader f = new FileReader("D:\\IO\\Hello.txt");
		int i=f.read();
		
		while(i!=-1) {
			
			System.out.print((char)i);
			i=f.read();
		}
		f.close();
	}

}
