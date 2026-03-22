import java.util.Scanner;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 2 != 0) {
                System.out.println(0);
            } else {
                int x = n / 2;
                System.out.println(x / 2 + 1); // floor(x/2) + 1
            }
        }
        sc.close();
    }
}
