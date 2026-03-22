import java.util.Scanner;

public class A_Array_Coloring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int prev = -1;
            if(arr[0] % 2 == 0){
                prev = 0;
            }else{
                prev = 1;
            }
            
            boolean flag = true;
            for(int i = 1; i < n; i++){
                if(prev == arr[i] % 2){
                    flag = false;
                    break;

                }
                prev = arr[i] % 2;
            }

            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
