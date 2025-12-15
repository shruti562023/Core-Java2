package io_info;

import java.io.File;
import java.util.Date;

public class FileInfo {
	
	public static void main(String[] args) {
		
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
		
	}

}

