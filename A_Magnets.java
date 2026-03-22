import java.util.Scanner;
public class A_Magnets{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        int count = 1;
        for(int i = 1; i < n; i++){
            if(str[i-1].charAt(1) == str[i].charAt(0)){
                count++;
            }
        }
        System.out.println(count);
    }
}