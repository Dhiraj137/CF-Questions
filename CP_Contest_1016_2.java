import java.util.Scanner;
public class CP_Contest_1016_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String str = sc.next();
            if(str.length() == 1){System.out.println(0); continue;}

            long non_zero = 0;
            long zero = 0;
            long l_z = 0;
            long t_z = 0;
            int x = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != '0'){
                    x = i;
                }else{
                    zero++;
                }
            }

            for(int i = 0; i < x; i++){
                if(str.charAt(i) == '0'){
                    l_z++;
                }else{
                    non_zero++;
                }
            }

            for(int i = x+1; i < str.length(); i++){
                if(str.charAt(i) == '0'){
                    t_z++;
                }
            }


            if(zero == 0){
                System.out.println(str.length()-1);
            }else{
                long z = t_z + non_zero;
                System.out.println(z);
            }

        }
    }
}
