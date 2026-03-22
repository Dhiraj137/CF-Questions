import java.util.Scanner;
public class A_Cover_in_Water{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();

             if(str.contains("...")){
                System.out.println(2);
            }else{
                int count = 0;
                int sum = 0;

                for(int i = 0; i < n; i++){
                    if(str.charAt(i) == '.'){
                        count++;
                    }else{
                        sum += count;
                        count = 0;
                    }
                }
                sum += count;
                System.out.println(sum);
            }
        }
    }
}