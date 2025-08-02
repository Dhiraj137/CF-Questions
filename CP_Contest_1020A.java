import java.util.Scanner;
public class CP_Contest_1020A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            int count = 0;
            for(int i = 0; i < n; i++){
                if(str.charAt(i) == '1'){
                    count++;
                }
            }
            int x = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '0'){
                    x++;
                }
            }
            int y = (count * n) + x - (n-x);
            System.out.println(y);
        }
        sc.close();
    }
}
