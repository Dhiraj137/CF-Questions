import java.util.Scanner;
import java.util.Arrays;

public class CP_1946A {
    public static void SearchMedian(int n) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // Calculate the median index.
        int medianIndex = (n - 1) / 2;
        int medianValue = arr[medianIndex];  // The median value after sorting.

        // Count occurrences of the median value.
        for (int i = medianIndex; i < n; i++) {
            if (arr[i] == medianValue) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // Loop through each test case.
        while (t-- > 0) {
            int n = sc.nextInt();
            SearchMedian(n);
        }

        sc.close();  // Closing the scanner at the end.
    }
}
