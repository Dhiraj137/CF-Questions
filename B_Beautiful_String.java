import java.util.Scanner;

public class B_Beautiful_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int zeros = 0;
            int ones = 0;

            for(int i = 0; i < n; i++){
                if(s.charAt(i) == '1'){
                    ones++;
                }else{
                    zeros++;
                }
            }

            if(ones == 0 || zeros == 0){
                System.out.println(0);
            }else{
                System.out.println(zeros);
                for(int i = 0; i < n; i++){
                    if(s.charAt(i) == '0'){
                        System.out.print((i+1)+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}