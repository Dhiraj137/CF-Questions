import java.util.Scanner;

public class B_Make_It_Increasing {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }

            int count = 0;
            for(int i = n-2; i >= 0; i--){
                if(arr[i] >= arr[i+1]){
                    while(arr[i] >= arr[i+1] && arr[i] > 0){
                        arr[i] /= 2;
                        count++;
                    }
                }
            }

            boolean flag = true;
            for(int i = 0; i < n-1; i++){
                if(arr[i] >= arr[i+1]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println(count);
            }else{
                System.out.println(-1);
            }
        }
    }
}
