import java.util.Scanner;

public class D_Odd_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long[] prefix = new long[n];
            long[] suffix = new long[n];

            prefix[0] = arr[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }

            suffix[n - 1] = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                suffix[i] = arr[i] + suffix[i + 1];
            }

            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                long k = sc.nextLong();

                l--;
                r--;

                long sum = 0;
                if (l != 0) {
                    sum += prefix[l - 1];
                }
                if (r != n - 1) {
                    sum += suffix[r + 1];
                }
                sum += (r - l + 1) * k;

                if (sum % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }

        sc.close();
    }
}
