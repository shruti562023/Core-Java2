package Coding_Question;

public class ArmStrong {
public static void main(String[] args) {
	
	int num=133;
	int rev=0;
	int temp=num;   
int rem;


while(temp!=0) {
	rem=temp%10;
	rev=rem*rem*rem+rev;
	temp=temp/10;
	
	
	
}

if(rev==num) {
	
	System.out.println("Armstrong num");
}
else {
	
	System.out.println(" not Armstrong num");
}
	
	
}
}
