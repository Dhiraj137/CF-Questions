import java.util.*;

public class A_Flip_Flops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();
            long[] arr = new long[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            
            for(int i = 0; i < n; i++){
                if(arr[i] > c) break;

                long diff = Math.min((c-arr[i]),k);
                c += diff + arr[i];
                k -= diff;
            }

            System.out.println(c);
        }
    }
}