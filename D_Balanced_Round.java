import java.util.*;
public class D_Balanced_Round{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long[] arr = new long[(int)n];
                        
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            
            long max = 0;
            long count = 0;
            Arrays.sort(arr);
            for(int i = 1; i < n; i++){
                if(arr[i]-arr[i-1] <= k) {
                    count++;
                }else{
                    count = 0;
                }

                max = Math.max(count,max);
            }

            System.out.println(n-max-1); 
        }
    }
}