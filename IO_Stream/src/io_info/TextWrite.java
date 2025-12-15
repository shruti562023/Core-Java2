package io_info;

import java.io.FileWriter;
import java.io.IOException;

public class TextWrite {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter file = new FileWriter("D://IO//Rays.txt");	
		file.write("hellooo rays");
		System.out.println("succesfully");
		file.close();
	}
	

}
