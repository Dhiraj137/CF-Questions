import java.util.*;

public class B_Make_it_Zigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            // Build prefix maximum array
            int[] pre = new int[n];
            pre[0] = a[0];
            for (int i = 1; i < n; i++) {
                pre[i] = Math.max(pre[i - 1], a[i]);
            }

            long ans = 0;
            for (int i = 0; i < n; i += 2) {
                int dif = -1;
                if (i > 0)
                    dif = Math.max(dif, a[i] - pre[i - 1]);

                if (i < n - 1)
                    dif = Math.max(dif, a[i] - pre[i + 1]);

                ans += dif + 1;
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
