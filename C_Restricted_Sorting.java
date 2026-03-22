import java.util.Arrays;
import java.util.Scanner;

public class C_Restricted_Sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] temp = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                temp[i] = arr[i];
            }

            boolean flag = true;
            for(int i = 1; i < n; i++){
                if(arr[i-1] > arr[i]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println(-1);
            }else{
                Arrays.sort(arr);
                int max = Integer.MIN_VALUE;

                for(int i = 0; i < n; i++){
                    if(arr[i] != temp[i]){
                        max = Math.max(max,Math.abs(arr[i]-temp[i]));   
                    }
                }
                System.out.println(max);
            }

        }
    }
}