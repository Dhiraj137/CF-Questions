import java.util.*;

public class B_Reverse_a_Permutation{
    public static void reverseArr(int[] arr,int s, int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

            int left = -1;
            for(int i = 0; i < n; i++){
                if(p[i] != n-i){
                    left = i;
                    break;
                }
            } 
            
            if(left != -1){
                int right = -1;
                for(int i = n-1; i >= 0; i--){
                    if(p[i] == n-left){
                        right = i;
                        break;
                    }
                }
                reverseArr(p,left,right);
            }

            for (int x : p) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
