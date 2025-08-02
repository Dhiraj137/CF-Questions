import java.util.Scanner;

public class CP_Contest_1016_3 {
    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int x = sc.nextInt(); // The number to repeat
            int k = sc.nextInt(); // Number of repetitions

            // Optimization shortcut: if x > 1 and k > 1, the result can’t be prime
            if (x > 1 && k > 1) {
                System.out.println("NO");
            } else {
                int n = 0;
                int mod = 1000000007;
                int base = (int) Math.pow(10, Integer.toString(x).length());

                for (int i = 0; i < k; i++) {
                    n = (n * base + x) % mod;
                }

                String str = isPrime(n) ? "YES" : "NO";
                System.out.println(str);
            }
        }

        sc.close();
    }
}
