import java.util.*;

public class CP_1832A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            if(str.length() == 1){
                System.out.println("NO");
                continue;
            }

            boolean allSame = true;
            for(int i = 1; i < str.length()/2; i++){
                if(str.charAt(i) != str.charAt(0)){
                    allSame = false;
                    break;
                }
            }

            if(allSame){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
