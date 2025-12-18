package PracticesofTextFile;

import java.io.File;
import java.sql.Date;

public class FileAcesssInfo {
	
	public static void main(String[] args) {
		
		
		File f=new File("D:\\IO\\MyFolder\\FileAcessInfo.txt");
		System.out.println("name "+f.getName());
		System.out.println("path "+f.getAbsolutePath());
		System.out.println("name "+f.length());
		System.out.println("name "+f.canRead());
		System.out.println("name "+f.canWrite());
		System.out.println("name "+f.isFile());
		System.out.println("name "+f.isDirectory());
		Date d=new Date(f.lastModified());
	System.out.println(d);
	}

}
