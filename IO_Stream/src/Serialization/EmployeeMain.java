package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee e=new Employee(1,"Shruti");
		
		ObjectOutputStream o =new ObjectOutputStream(new FileOutputStream("D:\\IO\\EmployeeData.txt"));
		
		
		o.writeObject(e);
		System.out.println("sucessfullyyyyyyyyyyyy");
		o.close();
		//Deserialization
		
		ObjectInputStream i = new ObjectInputStream(new FileInputStream("D:\\IO\\EmployeeData.txt"));
		
		System.out.println(i.readObject());
		i.close();
	}

}
