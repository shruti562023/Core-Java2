package Coding_Question;

public class DuplicateArray {
	
	public static void main(String[] args) {
		int[] a= {45,56,45,6,9,0,9};
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			
			boolean skip=false;
			for(int k=0;k<i;k++) {
				
				if(a[k]==a[i]) {
					
					skip=true;
					break;
				}
			}
			
			if(skip)
			{
				continue;
			}
			
			for(int j=0;j<a.length;j++) {
				
				if(a[i]==a[j])
				{
					
					count++;
					
				}
			}
			
			if(count>1) {
				
				System.out.println("unique array "+a[i]);
			}
		}
	}

}
