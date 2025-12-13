package Coding_Question;
import java.util.*;

public class ASCII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character: ");
        char c = sc.next().charAt(0);

        int c1 = (int) c;   // type casting (better practice)
        System.out.println("ASCII value of '" + c + "' is: " + c1);
    }
}
