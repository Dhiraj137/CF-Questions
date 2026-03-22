import java.util.Scanner;

public class A_El_fucho{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();   
        while(t-- > 0){
            int n = sc.nextInt();
            long x = n*n;
            long y = (n-1)*(n-1);
            long sum = x-y;
            if(sum % 2 != 0){
                sum--;
            }
            System.out.println(sum);
        }

    }
}