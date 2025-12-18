package PracticesofTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextBufferedWriter {
public static void main(String[] args) throws IOException {
	
	
	BufferedWriter b =new BufferedWriter(new FileWriter("D:\\IO\\MyFolder\\BufferedFileWriterInfo.txt"));
	b.write("Hello Shrutiiiiiiiiiiiiii");
	b.newLine();
	b.write("How are you");
	
	b.close();
	
}
}
