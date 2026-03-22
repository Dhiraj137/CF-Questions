import java.util.*;

public class B_Intercepted_Inputs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(int i = 0; i < k; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int left = 0; 
            int right = k-1;
            while(left < right){
                if(arr[left]*arr[right] == k-2){
                    System.out.println(arr[left] + " " + arr[right]);
                    break;
                }else if(arr[left]*arr[right] < k-2){
                    left++;
                }else{
                    right--;
                }
            }
        }
    }
}