import java.util.*;

public class B_Comparison_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();

            int max = 1;
            int count = 1;
            char prev = str.charAt(0);

            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i) == prev){
                    count++;
                }else{
                    prev = str.charAt(i);
                    count = 1;
                }
                max = Math.max(max,count);
            }
            System.out.println(max+1);
        }
    }
}