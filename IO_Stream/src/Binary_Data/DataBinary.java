package Binary_Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataBinary {
	
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream f=new FileInputStream("D:\\IO\\Semi.jpg");
		FileOutputStream o =new FileOutputStream("D://IO//cartoon.jpg");
		int i=f.read();
		while(i!=-1) {
			o.write(i);
			i=f.read();
		}
		
		f.close();
		o.close();
		System.out.println("sucessfullyy......");
		
	}

}
