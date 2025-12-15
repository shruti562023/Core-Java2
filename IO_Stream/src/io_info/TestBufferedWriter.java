package io_info;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferedWriter {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter b=new BufferedWriter(new FileWriter("D:\\\\IO\\\\Hello.java"));
		b.newLine();
		b.write("I am fine");
		b.newLine();
		b.write("okayy");
		
		
		System.out.println("Succesfullyyyyyyyyyyyyyyyy");
	b.close();	
		
	}

}
