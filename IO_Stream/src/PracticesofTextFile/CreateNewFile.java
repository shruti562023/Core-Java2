package PracticesofTextFile;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {
	public static void main(String[] args) throws IOException {
		
		
		File f =new File("D:\\IO\\MyFolder\\NewFile.txt");
		f.createNewFile();
		
		
	}
	

}
