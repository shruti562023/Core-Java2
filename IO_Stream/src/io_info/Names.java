package io_info;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Names {
	

		

		public static void main(String[] args) throws IOException {
			FileWriter file1 = new FileWriter("D://IO//Shruti.txt");
			FileWriter file2 = new FileWriter("D://IO//Adhiraj.txt");
			FileWriter file3 = new FileWriter("D://IO//Saket.txt");
			FileWriter file4 = new FileWriter("D://IO//Satyam.txt");
			
			file1.write("Shruti Rathore");
			
			file2.write("Adhiraj Singh Tomar");
			
			file3.write("Saket Singh");
			
			file4.write("Satyam");
			
			System.out.println("Succesfullyyyyyyyyyyyyyyyy");
	
			file1.close();

			file2.close();

			file3.close();

			file4.close();
		}

}
