package array;

public class SecondLargeArray {
	
	public static void main(String[] args) {

        int a[] = {3, 7, 9, 55,5};

        for(int i = 0; i < a.length; i++) {

            for(int j = i + 1; j < a.length; j++) {

                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                
            }

        }

        // Print second largest
        
       
        System.out.print(a[a.length - 2]);
	}
}
