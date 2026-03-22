import java.util.Scanner;

public class B_Swap_and_Delete{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            int zeros = 0;
            int ones = 0;
            int ts = 0;

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1'){
                    ones++;
                }else{
                    zeros++;
                }
            }

            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '0' && ones > 0){
                    ones--;
                    ts++;
                }else if(str.charAt(i) == '1' && zeros > 0){
                    zeros--;
                    ts++;
                }else{
                    break;
                }
            }
            System.out.println(str.length()-ts);
        }
    }
}