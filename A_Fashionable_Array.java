import java.util.*;

public class A_Fashionable_Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            if(arr[0] % 2 == arr[n-1] % 2){
                System.out.println(0);
            }else{
                int left = n; int right = n;

                for(int i = 1; i < n; i++){
                    if(arr[i]%2 != arr[0] % 2){
                        left = i;
                        break;
                    }
                }

                for(int i = 1; i < n; i++){
                    if(arr[n-1-i] % 2 != arr[n-1] % 2){
                        right = i;
                        break;
                    }
                }

                System.out.println(Math.min(left,right));
            }
        }
    }
}