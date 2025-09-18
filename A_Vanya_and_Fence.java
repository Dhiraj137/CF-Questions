import java.util.Scanner;
public class A_Vanya_and_Fence{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] <= h){
                count++;
            }else{
                count += 2;
            }
        }
        System.out.println(count);

    }
}