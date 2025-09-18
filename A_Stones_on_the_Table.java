import java.util.Scanner;
public class A_Stones_on_the_Table{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int count = 0;

        for(int i = 1; i < n; i++){
            if(str.charAt(i-1) == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}