package array;

public class DuplicateArray {

    public static void main(String[] args) {

        int a[] = {78, 78, 90, 88,90,88,8};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
