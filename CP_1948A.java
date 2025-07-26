import java.util.Scanner;
public class CP_1948A{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n % 2 == 1){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            char prev = 'A';
            for(int i = 0; i < n/2; i++){
                if(prev == 'A'){
                    System.out.print("AA");
                    prev = 'B';
                }else{
                    System.out.print("BB");
                    prev = 'A';
                }
            }
            System.out.println();
        }
    }
}