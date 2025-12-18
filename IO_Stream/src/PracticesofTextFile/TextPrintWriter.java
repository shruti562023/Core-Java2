package PracticesofTextFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class TextPrintWriter {
public static void main(String[] args) throws IOException {
	
	PrintWriter p=new PrintWriter("D:\\IO\\MyFolder\\PrintWriterInfo.txt");
	
	p.println("new line");
	p.println("code");
	
	p.close();
}
}
