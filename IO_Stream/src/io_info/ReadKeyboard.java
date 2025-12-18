package io_info;

import java.io.*;

public class ReadKeyboard {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter text: ");
        String data = br.readLine();

        System.out.println("You entered: " + data);
    }
}
