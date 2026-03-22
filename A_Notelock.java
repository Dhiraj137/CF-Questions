import java.util.Scanner;

public class A_Notelock{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int last = -100000;
            int ans = 0;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '0'){continue;}
                if(i-last >= k){
                    ans++;
                }
                last = i;
            }
            System.out.println(ans);
        }
    }
}