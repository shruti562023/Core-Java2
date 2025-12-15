package io_info;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadByKeyboard {
	public static void main(String[] args) throws IOException {
		
		
		PrintWriter p=new PrintWriter(new FileWriter("D:\\IO\\KeyboardFile.txt"));
		
		
		System.out.println("Enter text here !!");
		InputStreamReader s = new InputStreamReader(System.in);
		BufferedReader r=new BufferedReader(s);
		
		String line=r.readLine();
		
		while(!line.equals("exit")) {
			
			p.println(line);
			line=r.readLine();
		}
		
		
		
		p.close();
		s.close();
		r.close();
	}

}
