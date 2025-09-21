import java.util.Scanner;
public class A_Cut_the_Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            if(n < 3){
                System.out.println(0+" "+0);
            }else{
                if(sum % 3 == 0){
                    System.out.println(1+" "+2);
                }else{
                    System.out.println(0+" "+0);
                }
            }
        }
    }
}