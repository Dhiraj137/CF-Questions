import java.util.*;

public class B_Deck_of_Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int top = 0, bottom = 0, both = 0;

            for(char ch : s.toCharArray()){
                if (ch == '0') top++;
                else if (ch == '1') bottom++;
                else both++;
            }
            

            long maxtop = top + both;
            long maxbottom = bottom + both;

            if(n == k){
                for(int i = 0; i < n; i++){
                    System.out.print("-");
                }
                System.out.println();
                continue;
            }

            for(int i = 1; i <= n; i++){
                if(i <= top || i > (n-bottom)){
                    System.out.print("-");
                }else if(i <= maxtop || i > (n-maxbottom)){
                    System.out.print("?");
                }else{
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
