package io_info;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferedReader {
	
	public static void main(String[] args) throws IOException {
		
	BufferedReader b =new BufferedReader(new FileReader("D:\\IO\\Hello.java"));	
		
	String i=b.readLine();
	
	while(i!=null) {
		
		System.out.println(i);
		i=b.readLine();
	}
	
	
	b.close();
	
	}

}
