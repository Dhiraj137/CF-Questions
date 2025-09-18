import java.util.Scanner;
public class A_Submission_All_You_Need{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int min = 51;
            int sum = 0;
            for(int i = 0; i < n; i++){
                min = Math.min(arr[i],min);
                sum += arr[i];
            }
            if(min != 0){
                System.out.println(sum);
            }else{
                System.out.println(sum+1);
            }

        }
    }
}