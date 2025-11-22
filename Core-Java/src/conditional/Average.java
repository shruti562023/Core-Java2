package conditional;

public class Average {
	public static void main(String[] args) {
		int average;
		int sum=0;
		int count=0;
for(int i=1;i<=100;i++) {
	if(i%2==0) {
		
	sum=sum+i;
	count++;

	}
	

}

System.out.println(sum);
average=sum/count;
	System.out.print(average);
	
	

	
	
}
	
}
