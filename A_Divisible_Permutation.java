import java.util.Arrays;
import java.util.Scanner;

public class A_Divisible_Permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            Arrays.fill(arr,-1);

            int num = 1;
            for(int i = n-1; i >= 0; i = i-2){
                arr[i] = num;
                num++;
            }

            int num2 = n;
            for(int i = n-2; i >= 0; i = i-2){
                arr[i] = num2;
                num2--;
            }

            for(int i = 0; i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}