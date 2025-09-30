import java.util.*;

public class C_MEX_rose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];
        int[] f = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            f[a[i]]++;
        }

        int c1 = 0;
        int c2 = f[k];

        for (int i = 0; i < k; i++) {
            if (f[i] == 0) {
                c1++;
            }
        }

        System.out.println(Math.max(c1, c2));
        }
    }
}
