import java.util.Scanner;

public class B_Yuu_Koito_and_Minimum_Absolute_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // replace -1 with 0 for all except the last element (if intended by problem)
            // original code replaced only up to n-2, so we keep that behavior:
            for (int i = 0; i < Math.max(0, n - 1); i++) {
                if (a[i] == -1) a[i] = 0;
            }

            // special-case n == 1
            if (n == 1) {
                // if only one element, and it's -1 originally, treat as 0
                if (a[0] == -1) a[0] = 0;
                System.out.println(Math.abs(a[0])); // or problem-specific output
                System.out.println(a[0]);
                continue;
            }

            // build b[i] = a[i+1] - a[i] for i = 0 .. n-2
            long[] b = new long[Math.max(0, n - 1)];
            for (int i = 0; i < n - 1; i++) {
                b[i] = a[i + 1] - a[i];
            }

            // compute sum of first n-1 diffs (or all current b values)
            long sum = 0;
            for (int i = 0; i < b.length; i++) sum += b[i];

            // if last element was supposed to be computed from sum:
            // original code attempted to set a[n-1] based on sum of earlier diffs,
            // so replicate safer logic:
            if (a[n - 1] == -1) {
                // Decide how to set last element - original code set:
                // if (sum < 0) a[n-1] = abs(sum) + 1; else a[n-1] = 0;
                if (sum < 0) a[n - 1] = Math.abs(sum) + 1;
                else a[n - 1] = 0;

                // update last difference and total sum
                b[b.length - 1] = a[n - 1] - a[n - 2];
                // recompute full sum or just add delta
                sum = 0;
                for (int i = 0; i < b.length; i++) sum += b[i];
            } else {
                // last already given: ensure b[last] is consistent
                b[b.length - 1] = a[n - 1] - a[n - 2];
                sum = 0;
                for (int i = 0; i < b.length; i++) sum += b[i];
            }

            System.out.println(Math.abs(sum));
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + (i == n - 1 ? "\n" : " "));
            }
        }
        sc.close();
    }
}
