import java.util.*;

public class B_Heapify_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n+1];

            for(int i = 1; i <= n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i = 1; i <= n; i += 2){
                for(int j = i; j <= n; j *= 2){
                    for(int k = i*2; k <= n; k *= 2){
                        if(arr[k/2] > arr[k]){
                            int temp = arr[k/2];
                            arr[k/2] = arr[k];
                            arr[k] = temp;
                        }
                    }
                }
            }
            
            boolean isSorted = true;
            for(int i = 1; i < n; i++){
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}