import java.util.Scanner;
public class C_Maximum_Even_Sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

        if(a % 2 == 1 && b % 2 == 1){
            System.out.println(a*b+1);
        }else if(b % 2 == 0){
            if(((a*b/2)+2) % 2 == 0){
                System.out.println((a*b/2)+2);
            }else{
                System.out.println(-1);
            }
        }else{
            System.out.println(-1);
        }

        }
    }
}