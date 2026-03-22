import java.util.*;

public class D_Yet_Another_Array_Problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            for (long x : primes) {
                boolean ok = false;
                for (long num : a) {
                    if (num % x != 0) {
                        ok = true;
                        break;
                    }
                }
                if (ok) {
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
