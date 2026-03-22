import java.util.Scanner;

public class B_Blackslex_and_Showering{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = -1;
            int ind = -1;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                    ind = i;
                }
            }

            int sum = 0;
            if(ind == 0){
                for(int i = 1; i < n-1; i++){
                    sum += Math.abs(arr[i+1]-arr[i]);
                }
                System.out.println(sum);
            }else if(ind == n-1){
                for(int i = n-2; i > 0; i--){
                    sum += Math.abs(arr[i]-arr[i-1]);
                }
                System.out.println(sum);
            }else{
                for(int i = 0; i < n-1; i++){
                    sum += Math.abs(arr[i+1]-arr[i]);
                }
                sum -= (Math.abs(arr[ind]-arr[ind-1]) + Math.abs(arr[ind+1]-arr[ind]));
                sum += Math.abs(arr[ind+1]-arr[ind-1]);
                System.out.println(sum);
            }
        }
    }
}