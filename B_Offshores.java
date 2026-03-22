import java.util.Scanner;

public class B_Offshores{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long[] arr = new long[n];
            long total = 0;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
                total += (arr[i]/x)*y;
            }

            long max = 0;
            for(int i = 0; i < n; i++){
                max = Math.max(max,((arr[i]+total)-((arr[i]/x)*y)));
            }
            System.out.println(max);
        }
    }
}