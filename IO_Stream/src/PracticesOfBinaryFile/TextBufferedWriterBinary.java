package PracticesOfBinaryFile;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TextBufferedWriterBinary {
public static void main(String[] args) throws IOException {
	
	
	FileOutputStream s=new FileOutputStream("D:\\IO\\MyFolder\\cartoon.jpg");
	
	BufferedOutputStream b =new BufferedOutputStream(s);
	
	
	b.write(8787);
	b.write(89);
	
	b.close();
}
}
