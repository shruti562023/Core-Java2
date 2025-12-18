package io_info;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Name_Read1 {

    public static void main(String[] args) throws IOException {

        String[] inputs = {
                "D:\\IO\\Shruti.txt",
                "D:\\IO\\Adhiraj.txt",
                "D:\\IO\\Saket.txt",
                "D:\\IO\\Satyam.txt"
        };

        String outputFile = "D:\\IO\\DataNameAll.txt";

        BufferedWriter r = new BufferedWriter(new FileWriter(outputFile));

        for (String file : inputs) {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = br.readLine();
            while (line != null) {
                r.write(line);
                r.newLine();
                line = br.readLine();   // ⭐ IMPORTANT
            }

            br.close();  // ⭐ close reader
        }
System.out.println("sucessfully");
        r.close(); // close writer
    }
}
