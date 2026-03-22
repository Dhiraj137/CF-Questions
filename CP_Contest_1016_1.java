import java.util.Scanner;
public class CP_Contest_1016_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n % 2 == 0){System.out.println("NO");}
            else{System.out.println("YES");}
        }
    }
}
