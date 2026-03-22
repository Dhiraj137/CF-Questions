import java.util.*;

public class C_Replace_and_Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                b[i] = sc.nextInt();
            }


            for(int i = 0; i < n; i++){
                if(a[i] < b[i]){
                    a[i] = b[i];
                }
            }

            for(int i = n-1; i > 0; i--){
                if(a[i] > a[i-1]){
                    a[i-1] = a[i];
                }
            }

            int[] arr = new int[n];
            arr[0] = a[0];
            for(int i = 1; i < n; i++){
                arr[i] = a[i] + arr[i-1];
            }
            int[] ans = new int[q];

            for(int i = 0; i < q; i++){
                int l = sc.nextInt();
                int r = sc.nextInt();

                l--;r--;
                ans[i] = (l > 0 && r > 0) ? arr[r]-arr[l-1]:arr[r];
            }

            for(int x : ans){
                System.out.print(x + " ");
            }
            System.out.println();

        }
    }
}