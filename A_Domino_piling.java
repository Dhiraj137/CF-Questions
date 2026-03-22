import java.util.Scanner;
public class A_Domino_piling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m % 2 == 0){
            int ans = n*(m/2);
            System.out.println(ans);
        }else{
            int ans = ((n*(m/2)) + n/2);
            System.out.println(ans);
        }

    }
}