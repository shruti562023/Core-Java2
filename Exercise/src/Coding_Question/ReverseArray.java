package Coding_Question;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int a[]= {10,56,6,9,0};
	int start=0;
	int end=a.length-1;
	int temp;
	while(start<end){
		
	temp=a[start];
	a[start]=a[end];
	a[end]=temp;
	
	start++;
	end--;
	}
	
	System.out.println(Arrays.toString(a));
}
}
