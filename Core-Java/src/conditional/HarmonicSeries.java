package conditional;

public class HarmonicSeries {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += 1.0 / i;
            System.out.println("1/" + i);
        }

        System.out.println("Sum = " + sum);
    }
}
