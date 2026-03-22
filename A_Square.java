import java.util.Scanner;

public class A_Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            boolean x = a == b && b == c && c == d;
            if (x) {
                System.out.println("YES");    
            }else{
                System.out.println("NO");
            }

        }
    }
}