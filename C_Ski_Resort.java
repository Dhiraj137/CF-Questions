import java.util.Scanner;

public class C_Ski_Resort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long q = sc.nextLong();

            int[] arr = new int[(int)n];
            for(int i = 0; i < n; i++){
                long x = sc.nextLong();
                arr[i] = (x > q) ? 0:1;
            }

            long ways = 0;
            long count = 0;

            for(int i = 0; i < n; i++){
                if(arr[i] == 1){
                    count++;
                }else{
                    if(count >= k){
                        long diff = count - k + 1;
                        ways += (diff*(diff+1))/2;
                    }
                    count = 0;
                }
            }
            if(count >= k){
                long diff = count - k + 1;
                ways += (diff*(diff+1))/2;
                count = 0;
            }
            System.out.println(ways);
        }
    }
}