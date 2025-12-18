package PracticesOfBinaryFile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextBufferedBinary {
	
	public static void main(String[] args) throws Exception {
		
		
		 FileInputStream f =
	                new FileInputStream("D:\\IO\\MyFolder\\cartoon.jpg");

	        BufferedInputStream b =
	                new BufferedInputStream(f);
	        
	        int data=b.read();
	        while(data!=-1) {
	        	System.out.println(data);

	        data=b.read();
	        		}
	        
	        b.close();
	}

}
