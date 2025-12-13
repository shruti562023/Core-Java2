package Coding_Question;

public class DecsendingArray {
	
	public static void main(String[] args) {
		
		
		
int[] a= {6,56,85,4,9,0};

for(int i=0;i<a.length;i++) {
	for(int j=0;j<a.length-i-1;j++) {
		if(a[j]<a[j+1]) {
			
		int temp=a[j];	
			
			a[j]=a[j+1];
			a[j+1]=temp;
		}

	}
	


}
		
System.out.println("Descending Order:");
for(int x : a) {
    System.out.println(x);
}
		
		
	}

}
