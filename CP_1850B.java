import java.util.Scanner;
import java.util.Arrays;
public class CP_1850B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] que = new int[n];
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                que[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            int ind = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] <= 10 && max < que[i]){
                    ind = i;
                    max = que[i];
                }
            }
            System.out.println(ind+1);
        }
    }
}
