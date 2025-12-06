package basic;

public class AverageOddEven {
	public static void main(String[] args) {
		int avg; int sum=0;
		int count=0;
	for(int i=0;i<=100;i++) {
		
		if(i%2==0) {
			sum=sum+i;
			count++;
			
			
		}
		

		
		
		
		
	}
	System.out.println("sum" +sum);
	
	avg=sum/count;
	System.out.println("avg " +avg);
		
	}

}
