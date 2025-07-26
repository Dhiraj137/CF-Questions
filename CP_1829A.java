import java.util.Scanner;
public class CP_1829A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str2 = "codeforces";
            String str = sc.next();
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != str2.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
