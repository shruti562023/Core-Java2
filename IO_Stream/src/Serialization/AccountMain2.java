package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AccountMain2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	
		Account a =new Account("6667766667",789.0);
		ObjectInputStream o = new ObjectInputStream(new FileInputStream("D:\\IO\\AccountData.txt"));
		
		System.out.println(o.readObject());
		
		o.close();
		System.out.println("sucessssssss");
		
	}

} 
