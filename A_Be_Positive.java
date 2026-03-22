import java.util.Scanner;
public class A_Be_Positive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int zeros = 0;
            int nones = 0;
            for(int i = 0; i < n; i++){
                int x = sc.nextInt();
                if(x == 0){zeros++;}
                else if(x == -1){nones++;}
            }

            if(nones % 2 == 0){
                System.out.println(zeros);
            }else{
                System.out.println(2+zeros);
            }

        }
    }
}