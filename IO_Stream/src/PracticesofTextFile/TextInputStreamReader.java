package PracticesofTextFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextInputStreamReader {
	
	public static void main(String[] args) throws IOException {
		BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter text");
		String s=b.readLine();
		System.out.println(s);
	}

}
