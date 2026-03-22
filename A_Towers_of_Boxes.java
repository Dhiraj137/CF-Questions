import java.util.Scanner;

public class A_Towers_of_Boxes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();

            int k = 1 + (d/m);
            int x = (n+k-1)/k;
            System.out.println(x);
        }
    }
}