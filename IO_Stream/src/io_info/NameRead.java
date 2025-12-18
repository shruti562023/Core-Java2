package io_info;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NameRead {
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader r1=new BufferedReader(new FileReader("D:\\IO\\Shruti.txt"));
		
		BufferedReader r2=new BufferedReader(new FileReader("D:\\IO\\Adhiraj.txt"));
				
				BufferedReader r3=new BufferedReader(new FileReader("D:\\IO\\Saket.txt"));
						
						BufferedReader r4=new BufferedReader(new FileReader("D:\\IO\\Satyam.txt"));
				//Shruti		
						String line1=r1.readLine();
						
						while(line1!=null) {
							System.out.println(line1);
							
					  line1=r1.readLine();
					  
						}
						//Shruti		
						String line2=r2.readLine();
						
						while(line2!=null) {
							System.out.println(line2);
							
					  line2=r2.readLine();
					  
						}
						//Shruti		
						String line3=r3.readLine();
						
						while(line3!=null) {
							System.out.println(line3);
							
					  line3=r3.readLine();
					  
						}
						//Shruti		
						String line4=r4.readLine();
						
						while(line4!=null) {
							System.out.println(line4);
							 
					  line4=r4.readLine();
					  
						}
						
						
						
						r1.close();
						r2.close();
						r3.close();
						r4.close();
	}

}
