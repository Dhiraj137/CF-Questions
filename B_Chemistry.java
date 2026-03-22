import java.util.Arrays;
import java.util.Scanner;

public class B_Chemistry{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t--  > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            if(k == n-1){
                System.out.println("YES");
            }else{
                int[] arr = new int[26];
                Arrays.fill(arr,0);
                for(int i  = 0; i < n; i++){
                    char ch = str.charAt(i);
                    arr[ch-'a']++;
                }
                int x = 0; 
                for(int i = 0; i < arr.length; i++){
                    if(arr[i] % 2 != 0){
                        x++;
                    }
                }

                if(x <= k+1){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
    }
}