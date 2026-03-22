import java.util.Scanner;

public class B_Hourglass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            long s = sc.nextLong(); // initial sand
            long k = sc.nextLong(); // flip time
            long m = sc.nextLong(); // total time

            long result;

            if (s > k) {
                m = m % (2 * k);

                if (m < k) {
                    result = s - m;
                } else {
                    result = k - (m - k);
                }
            } else {
                m = m % k;

                if (m < s) {
                    result = s - m;
                } else {
                    result = 0;
                }
            }

            System.out.println(result);
        }
    }
}