import java.util.*;

public class A_Circle_of_Apple_Trees{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            int min = arr[0];
            int count = 1;
            for(int i = 1; i < n; i++){
                if(arr[i] > min){
                    count++;
                    min = arr[i];
                }
            }
            System.out.println(count);
        }
    }
}