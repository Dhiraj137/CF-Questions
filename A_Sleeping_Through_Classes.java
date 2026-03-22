import java.util.Scanner;

public class A_Sleeping_Through_Classes{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int count = 0;
            for(int i = 0; i < n; i++){
                if(str.charAt(i) == '0'){
                    count++;
                }else{
                    i = i+k;
                }
            }
            System.out.println(count);
        }
    }
}