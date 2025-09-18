import java.util.Scanner;
public class CP_1437A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(2*l > r){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}