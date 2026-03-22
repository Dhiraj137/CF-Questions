import java.util.*;

public class B_Distinct_Elements{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while(t-- > 0){
            long n = sc.nextLong();
            long[] arr = new long[(int)n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }

            long[] ans = new long[(int)n];
            ans[0] = 1;
            int c = 1;
            for(int i = 1; i < n; i++){
                int index = i+1;
                int diff = (int)(arr[i]-arr[i-1]);
                if(diff == index){
                    ans[i] = ++c;
                }else{
                    ans[i] = ans[i-diff];
                }
            }
            for(int i = 0; i < n; i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}