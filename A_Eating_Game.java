import java.util.Scanner;

public class A_Eating_Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                }
            }

            int count = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] == max) count++;
            }
            System.out.println(count);
        }
    }
}