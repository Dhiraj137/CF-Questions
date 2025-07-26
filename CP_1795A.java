import java.util.Scanner;
public class CP_1795A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int s = sc.nextInt();
            int x = sc.nextInt();
            String str1 = sc.next();
            String str2 = sc.next();
            StringBuilder str3 = new StringBuilder("");
            str3.append(str1);
            for(int i = x-1; i >= 0; i--){
                str3.append(str2.charAt(i));
            }
            int count = 0;
            for(int i = 1; i < str3.length(); i++){
                if(str3.charAt(i) == str3.charAt(i-1)){
                    count++;
                }
            }
            if(count == 0 || count == 1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
