import java.util.Scanner;
public class CP_2092A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int x = Integer.MAX_VALUE;
            int y = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                x = Math.min(x,arr[i]);
                y = Math.max(y,arr[i]);
            }
            System.out.println(y-x);
        }
    }
}
