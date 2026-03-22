import java.util.Scanner;
public class A_Police_Recruits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int police = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                police += arr[i];
            }

            if(police == 0 && arr[i] < 0){
                count++;
            }

            if(police != 0 && arr[i] < 0){
                police--;
                if(police < 0){
                    police = 0;
                }
            }
        }
        System.out.println(count);
    }
}