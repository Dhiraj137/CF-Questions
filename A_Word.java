import java.util.Scanner;
public class A_Word{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int uc = 0;
        int lc = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                uc++;
            }else{
                lc++;
            }
        }

        if(uc > lc){
            System.out.println(str.toUpperCase());
        }else{
            System.out.println(str.toLowerCase());
        }

    }
}