package string;

public class OccuranceOneChar {
public static void main(String[] args) {
	
String str="Moon";
char c ='o';
int count=0;

for(int i=0;i<str.length();i++) {
	if(c==str.charAt(i)) {
		
		count++;
	}
	
}

System.out.println("count of " +c  +" is : " + count);
	
	
}
}
