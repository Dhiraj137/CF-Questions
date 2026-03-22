import java.util.Scanner;

public class A_Simons_and_Making_It_Beautiful{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            int ind = -1;
            int max = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                    ind = i;
                }
            }
            

            int temp = arr[ind];
            arr[ind] = arr[0];
            arr[0] = temp;

            for(int i = 0;i < n; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}