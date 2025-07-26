import java.util.Scanner;
import java.util.Arrays;
public class CP_2003B{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            long arr[] = new long[(int) n];
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            System.out.println(arr[arr.length/2]);

        }
    }
}