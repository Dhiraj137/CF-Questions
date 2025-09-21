import java.util.Scanner;
public class A_All_Lengths_Subtraction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int curr = 1;
            int l = 0; int r = n-1;
            boolean flag = true;

            while(curr <= n){
                
                if(arr[l] == curr){
                    l++;
                    curr++;
                    continue;
                }
                if(arr[r] == curr){
                    r--; 
                    curr++;
                    continue;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}