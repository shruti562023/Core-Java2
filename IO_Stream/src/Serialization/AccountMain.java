package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AccountMain {
	
	public static void main(String[] args) throws IOException {
		
		Account a =new Account("6667766667",789.0);
		
		ObjectOutputStream o =new ObjectOutputStream(new FileOutputStream("D:\\IO\\AccountData.txt"));
		
		
		o.writeObject(a);
		
		o.close();
		System.out.println("object serialized successfully");

	}
	

}
