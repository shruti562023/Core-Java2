
//check 2 arrays are equal or not?
package Coding_Question;

 public class ArraysCheck {
	
	public static void main(String[] args) {
	
		
		int a[] = {10,20,30,60};
		
		int a1[] = {10,20,30,69};
		
		boolean result=true;
		
		if(a.length!=a1.length) {
		result = false;	
			
		}  
for(int i=0;i<a.length;i++) {
	
	if(a[i]!=a1[i]) {
		result=false; 
		
	}
}     if(result) {
    System.out.println("Arrays are equal");
} else {
    System.out.println("Arrays are not equal");
}
	}

}
