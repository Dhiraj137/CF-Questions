import java.util.Scanner;
public class B_Tournament{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }

            int max = -1;
            for(int i= 0; i < n; i++){
                max = Math.max(arr[i],max);
            }
            // System.out.println(max);
            if(k == 1 && arr[j-1] != max){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}