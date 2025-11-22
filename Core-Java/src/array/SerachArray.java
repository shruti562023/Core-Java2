
package array;

class SerachArray {

    public static int search(int[] arr, int key) {
       
    	for(int i=0;i<arr.length;i++) {
    		
    		if(arr[i]==key) {
    			
    			return i;
    		}
    	}
		return 1;
    	
    	
    	
    	
    	
    }

    public static void main(String[] args) {
        int[] arr = {100, 90, 80, 70, 60, 50};
        int key = 760;

        int pos = search(arr, key);
        System.out.println("index: " +pos);
    }
}
