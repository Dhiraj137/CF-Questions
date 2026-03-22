import java.util.Scanner;
import java.util.Arrays;
public class CP_Contest_1013B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int c = 0;
            for(int i = arr.length-1; i >= 0; i--){
                int l = 1;
                if(arr[i]*l >= x){
                    c++;
                }else{
                    int j = i;
                    while((j >= 0) && ((arr[j]*l) < x)) {
                        j--;
                        l++;
                    }
                    if(j==-1){break;}
                    else{
                        c++;
                        i = j;
                    }

                }
            }
            System.out.println(c);
        }
    }
}
