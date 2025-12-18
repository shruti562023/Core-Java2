package io_info;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ValidMobile {

	public static void main(String[] args) throws IOException {

		FileReader r = new FileReader("D:\\IO\\MobileNumberRead.txt");
		FileWriter w = new FileWriter("D:\\IO\\MobileNumberWrite.txt");

		BufferedReader b1 = new BufferedReader(r);
		BufferedWriter b2 = new BufferedWriter(w);
		String number = b1.readLine();

		String regexNum = "^[6-9]\\d{9}$";

		while (number != null) {

			if (number.matches(regexNum)) {
				System.out.println(number);
				b2.write(number);
				b2.newLine();
			}
			number = b1.readLine();
		}

		b1.close();
		b2.close();

	}

}
