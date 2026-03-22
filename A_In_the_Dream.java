import java.util.Scanner;
public class A_In_the_Dream{

    public static boolean check(int a, int b){
            
            int x = Math.min(a,b);
            int y = Math.max(a,b);
            return y <= 2*x + 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        boolean x = check(a,b);
        boolean y = check(c-a,d-b);
        if(x && y){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        }

    }
}