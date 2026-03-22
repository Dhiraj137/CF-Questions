import java.util.*;

public class C_Shifted_MEX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            int maxLen = 1;
            int currLen = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    continue; // ignore duplicates
                } else if (a[i] == a[i - 1] + 1) {
                    currLen++;
                } else {
                    currLen = 1;
                }
                maxLen = Math.max(maxLen, currLen);
            }

            System.out.println(maxLen);
        }
    }
}
