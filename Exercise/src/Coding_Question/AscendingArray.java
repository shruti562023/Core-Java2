package Coding_Question;

public class AscendingArray {
	
	public static void main(String[] args) {
		
		
	int a[]	= {66,3,99,90,6};
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;;
			}
	
			
			
		}
		System.out.println(a[i]);
	}
		
		
	}

}
