import java.util.*;

public class A_Twice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[21];
            Arrays.fill(arr,0);
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                arr[x]++;
            }

            int count = 0;
            for(int i = 0; i < 21; i++){
                if(arr[i] > 1){
                    count += (arr[i] / 2);
                }
            }
            System.out.println(count);
        }
    }
}