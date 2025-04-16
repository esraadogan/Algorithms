package ConsecutiveNumbersSum;

public class ConsecutiveNumbersSum {

    public static int findConsecutiveSums(int n) {
        int count = 0;

        for (int k = 2; k * (k - 1) / 2 < n; k++) {
            int numerator = n - (k * (k - 1)) / 2;
            if (numerator % k == 0) {
                count++;
            }
        }

        return count;
    }

    public static void printConsecutiveSums(int n) {
        for (int k = 2; k * (k - 1) / 2 < n; k++) {
            int numerator = n - (k * (k - 1)) / 2;
            if (numerator % k == 0) {
                int start = numerator / k;
                System.out.print("Dizi: ");
                for (int i = 0; i < k; i++) {
                    System.out.print((start + i) + " ");
                }
                System.out.println();
            }
        }
    }
}
