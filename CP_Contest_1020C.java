import java.util.Scanner;
import java.util.Arrays;
public class CP_Contest_1020C {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int x = 0;
            int count = 0;
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                if((b[i] != -1) && x == 0){
                    x = a[i] + b[i];
                }else{
                    count++;
                }
            }
            System.out.println(x);
            if(count < n){
                boolean check = false;
                for(int i = 0; i < n;i++){
                    if(b[i] == -1){
                        for(int j = 0; j < k; j++){
                            if((a[i] + j) == x){
                                check = true;
                            }
                        }
                    }
                }
                if(check){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }

            }else{
                Arrays.sort(a);
                int q = a[n-1];
                int z = ((k+2) - q);
                System.out.println(z);
            }
        }
    }
}
