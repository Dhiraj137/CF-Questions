import java.util.Scanner;
public class CP_Contest_1017_4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String p = sc.next();
            String s = sc.next();
            if(p.charAt(0) != s.charAt(0)){System.out.println("NO"); continue;}
            int i = 0;
            int j = 0;
            int x = 0;

            while((i < p.length()) && (j < s.length()) && (p.charAt(i) == s.charAt(j))){
                int c_p = 0;
                int c_s = 0;
                int temp = i;
                while(temp < p.length() && (p.charAt(i) == p.charAt(temp))){
                    c_p++;
                    temp++;
                }
                int temp2 = j;
                while(temp2 < s.length() && s.charAt(j) == s.charAt(temp2)){
                    c_s++;
                    temp2++;
                }

                if(c_s >= c_p && c_s <= 2*c_p){
                    i = temp;
                    j = temp2;
                }else{
                    System.out.println("NO");
                    x=1;
                    break;
                }
            }
            if(i >= p.length() && j >= s.length()){
                System.out.println("YES");
            }else if(x==0){
                System.out.println("NO");
            }
        }
    }
}