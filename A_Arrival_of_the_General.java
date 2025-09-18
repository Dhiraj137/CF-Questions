import java.util.Scanner;
public class A_Arrival_of_the_General{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int maxInd = -1;
        int minInd = -1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
                maxInd = i;
            }
        }

        for(int i = n-1; i >= 0; i--){
            if(arr[i] < min){
                min = arr[i];
                minInd = i;
            }
        
        }
        // if(max == arr[0] && min == arr[n-1]){
        //     System.out.println(0);
        // }
        if(maxInd < minInd){
            System.out.println(maxInd+(n-1-minInd));
        }
        if(minInd < maxInd){
            System.out.println(maxInd + (n-2-minInd));
        }
    }
}