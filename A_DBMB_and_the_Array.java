import java.util.Scanner;

public class A_DBMB_and_the_Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            if(sum == s){
                System.out.println("YES");
            }else if(sum > s){
                System.out.println("NO");
            }else{
                while(sum < s){
                    sum += x;
                }
                if(sum == s){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
                
            }
        }
    }   
}