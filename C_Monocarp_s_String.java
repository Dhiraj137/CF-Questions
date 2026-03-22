import java.util.Scanner;

public class C_Monocarp_s_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();

            int a = 0;
            int b = 0;
            for(char ch : s.toCharArray()){
                if(ch == 'a')a++;
                else b++;
            }
            if(a == n || b == n){
                System.out.println(-1);
            }else if(a == b){
                System.out.println(0);
            }else{
                if(a > b){
                    int dif = a-b;
                    StringBuffer str = new StringBuffer("");
                    for(int i = 0; i < dif; i++){
                        str.append("a");
                    }

                    if(s.contains(str.toString())){
                        System.out.println(dif);
                    }else{
                        System.out.println(-1);
                    }
                }else{
                    int dif = b-a;
                    StringBuffer str = new StringBuffer("");
                    for(int i = 0; i < dif; i++){
                        str.append("b");
                    }

                    if(s.contains(str.toString())){
                        System.out.println(dif);
                    }else{
                        System.out.println(-1);
                    }
                }
            }
        }
    }
}