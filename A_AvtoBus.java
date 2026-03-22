import java.util.Scanner;

public class A_AvtoBus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            if (n < 4 || n % 2 != 0) {
                System.out.println(-1);
            } else {
                long minBuses = (n + 5) / 6; // CEIL(n / 6)
                long maxBuses = n / 4;       // FLOOR(n / 4)
                System.out.println(minBuses + " " + maxBuses);
            }
        }
    }
}
