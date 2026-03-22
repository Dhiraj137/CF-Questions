import java.util.Scanner;
public class CP_Contest_1020B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = i;
            }
            if(x < n){
                int temp = arr[x];
                arr[x] = arr[n-1];
                arr[n-1] = temp;
            }
            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
