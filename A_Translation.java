import java.util.Scanner;
public class A_Translation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        boolean flag = true;
        if(s.length() != t.length()){
            System.out.println("NO");
        }else{
            for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(t.length()-1-i)){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        }
    }
}