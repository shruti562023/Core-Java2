package io_info;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
      
public class ValidEmail {
	
	public static void main(String[] args) throws IOException {
		
		
		FileReader source =new FileReader("D:\\IO\\EmailRead.txt");
		FileWriter target= new FileWriter("D:\\IO\\EmailWrite.txt");
		
		BufferedReader b =new BufferedReader(source);
		BufferedWriter w = new BufferedWriter(target);
		
		String email=b.readLine();
		
		while(email!=null) {
		if(email.endsWith("@gmail.com")) {
			System.out.println(email);
			w.write(email);
			w.newLine();
			
		}
		email=b.readLine();
				
	}
		
		b.close();
		w.close();
	}

}
