import java.util.Scanner;

public class A_Ambitious_Kid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean zero = false;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                zero = true;
                break;
            }else{
                min = Math.min(min,Math.abs(arr[i]));
            }
        }
        if(zero){
            System.out.println(0);
        }else{
            System.out.println(min);
        }

    }
}