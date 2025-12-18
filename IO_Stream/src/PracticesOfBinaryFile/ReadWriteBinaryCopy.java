package PracticesOfBinaryFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadWriteBinaryCopy {
	
	public static void main(String[] args) throws Exception {
		
		
		BufferedInputStream i=new BufferedInputStream( new FileInputStream("D:\\IO\\MyFolder\\cartoon.jpg"));
		BufferedOutputStream o=new BufferedOutputStream( new FileOutputStream("D:\\IO\\MyFolder\\Semi.jpg"));
		
	int y=i.read();
	while(y!=-1) {
		o.write(y);
		y=i.read();
	}
		o.close();
		i.close();
	
	
	}

}
