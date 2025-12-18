package PracticesofTextFile;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter {
public static void main(String[] args) throws IOException {
	
	
	
	FileWriter f =new FileWriter("D:\\IO\\MyFolder\\FileWriterInfo.txt");
	
	f.write("Hello\n");
	f.write("java");
	
	f.close();
	System.out.println("Suceesfullyyyyyyy");

	
}
}
