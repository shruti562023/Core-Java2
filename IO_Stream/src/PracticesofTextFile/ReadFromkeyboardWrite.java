package PracticesofTextFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromkeyboardWrite {

    public static void main(String[] args) throws IOException {

        PrintWriter p = new PrintWriter("D:\\IO\\MyFolder\\ReadWriteFromKeyboard.txt");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text (type 'quit' to stop):");

        String y = b.readLine();
        while (!y.equals("quit")) {
            p.println(y);
            y = b.readLine();   // ✅ update input
        }

        p.close();
        b.close();
    }
}
