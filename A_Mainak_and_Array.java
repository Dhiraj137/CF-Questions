import java.util.*;

public class A_Mainak_and_Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            
           int max = Integer.MIN_VALUE;
            for(int i = 1; i < n; i++){
                max = Math.max(max,arr[i]-arr[0]);
            }

            for(int i = 0; i < n-1; i++){
                max = Math.max(max,arr[n-1]-arr[i]);
            }

            max = Math.max(max,arr[n-1]-arr[0]);

            for(int i = 1; i < n; i++){
                max = Math.max(max,arr[i-1]-arr[i]);
            }

            System.out.println(max);
        }
    }
}