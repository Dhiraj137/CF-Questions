import java.util.Scanner;

public class A_Perfect_Root{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}