import java.util.*;

public class A_Alice_and_Bob {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long a = sc.nextLong();
            long[] arr = new long[n];
            int l = 0;
            int r = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                if(a > arr[i]) l++;
                if(a < arr[i]) r++;
            }

            System.out.println(l > r ? a-1:a+1);
        }
    }
}
