import java.util.*;
public class B_Fun_Permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int[] q = new int[n];
            for(int i = 0; i < n; i++){
                q[i] = Math.abs(n+1-arr[i]);
            }

            for(int i = 0; i < n; i++){
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }
}