package PracticesofTextFile;

import java.util.Scanner;

public class TextScanner {
	
	public static void main(String[] args) {
		
	Scanner s =new Scanner(System.in);	
	System.out.println("enter value of int");
	int a =s.nextInt();
	System.out.println(a);
	
	System.out.println("enter value of float");
	float a1 =s.nextFloat();
	System.out.println(a1);
	
	System.out.println("enter value of double");
	double a2 =s.nextDouble();
	System.out.println(a2);
	
	System.out.println("enter value of boolean");
	boolean  a3 =s.nextBoolean();
	System.out.println(a3);
	
    System.out.println("enter String");
    String a4 = s.next();
    System.out.println(a4);

    s.nextLine(); // 🔴 consume leftover newline

    System.out.println("enter String of");
    String a5 = s.nextLine();
    System.out.println(a5);
	
		
	
	}

}
