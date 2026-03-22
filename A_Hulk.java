import java.util.Scanner;
public class A_Hulk{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer str = new StringBuffer("");

        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                str.append("I hate");
            }else{
                str.append("I love");
            }

            if(i == n){
                str.append(" it");
            }else{
                str.append(" that ");
            }
        }
    
        // String st = str.toString().stripTrailing()
        System.out.println(str.toString().stripTrailing());
    }
}