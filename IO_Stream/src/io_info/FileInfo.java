package io_info;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfo {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Acess File iformation");
		File f = new File("D:\\IO\\Hello.txt");
		
		System.out.println("File Name "+f.getName());
		System.out.println("File Path "+f.getAbsolutePath());
		System.out.println("File write? "+f.canWrite());
		System.out.println("File Read? "+f.canRead());
		System.out.println("File Length "+f.length());
		System.out.println("File exist "+f.isFile());
		System.out.println("Directory exist "  +f.isDirectory());
		Date lastModify=new Date(f.lastModified());
		System.out.println("update info date "+lastModify);
		
		
		File f1 = new File("D:\\IO\\DemoS.txt");
		f1.createNewFile();   // throws IOException

		File dir = new File("D:\\IO\\MyFolder");
		dir.mkdir();        // single folder

	}

}

