package PracticesOfBinaryFile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PrimitivateData {
	
	public static void main(String[] args) throws Exception {
		
		
		DataOutputStream d=new DataOutputStream(new FileOutputStream("D:\\IO\\MyFolder\\Primitive.txt"));
		
	d.writeInt(67);
	d.writeDouble(7878.9);
	
	d.writeBoolean(false);
		d.close();
		
		
		
		DataInputStream y=new DataInputStream(new FileInputStream("D:\\IO\\MyFolder\\Primitive.txt"));
		
		System.out.println(y.readInt());

		System.out.println(y.readDouble());

		System.out.println(y.readBoolean());

		
		y.close();
	}

}
