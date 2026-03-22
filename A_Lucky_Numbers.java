import java.util.Scanner;

public class A_Lucky_Numbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int p = 0;
            int ans = -1;
                for(int i = l; i <= Math.min(l+100,r); i++){
                    String str = String.valueOf(i);
                    int mx = str.charAt(0);
                    int mn = str.charAt(0);

                    for(int j = 1; j < str.length(); j++){
                        mx = Math.max(mx,str.charAt(j));
                        mn = Math.min(mn,str.charAt(j));
                    }
                    if(ans < mx - mn){
                        ans = mx-mn;
                        p = i;
                    }
                }
            System.out.println(p);
        }
    }
}