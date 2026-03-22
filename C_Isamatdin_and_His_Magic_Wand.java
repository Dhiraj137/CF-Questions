import java.util.*;

public class C_Isamatdin_and_His_Magic_Wand{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long[] arr = new long[n];

            int even = 0, odd = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
                if(arr[i] % 2 == 0){
                    even++;
                }else{
                    odd++;
                }
            }

            if(even == n || odd == n){
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
            }else{
                Arrays.sort(arr);
                for(int i = 0; i < n; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}