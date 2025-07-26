import java.util.Scanner;
public class CP_1985A {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            StringBuilder str = new StringBuilder(sc.next());
            StringBuilder str2 = new StringBuilder(sc.next());
            char temp = str.charAt(0);
            str.setCharAt(0,str2.charAt(0));
            str2.setCharAt(0,temp);
            System.out.println(str + " " + str2);

        }
    }
}
