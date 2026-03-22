import java.util.Scanner;
public class CP_2027A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int w = Integer.MIN_VALUE;
            int h = Integer.MIN_VALUE;
            int x;
            int y;
            for(int i = 0; i < n; i++){
                x = sc.nextInt();
                y = sc.nextInt();
                if(x > w ){
                    w = x;
                }
                if(y > h){
                    h = y;}

            }
            System.out.println(2*(w+h));
        }
    }
}