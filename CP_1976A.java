import java.util.Scanner;
public class CP_1976A{
    public static boolean check(int n, String str){
        for(int i = 0; i < n-1; i++){
            if(str.charAt(i) > str.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();
            if(check(n,str)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}