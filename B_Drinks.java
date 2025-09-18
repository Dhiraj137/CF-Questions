import java.util.Scanner;
public class B_Drinks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 0.0;

        for(int i = 0; i < n; i++){
            ans += sc.nextDouble();
        }
        System.out.println(ans/n);
    }
}