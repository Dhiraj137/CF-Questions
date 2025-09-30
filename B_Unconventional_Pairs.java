import java.util.Scanner;
import java.util.Arrays;

public class B_Unconventional_Pairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            Long max = (long)Integer.MIN_VALUE;
            for(int i = 0; i < n; i = i + 2){
                max = Math.max(max,Math.abs(arr[i]-arr[i+1]));
            }

            System.out.println(max);
        }
    }
}