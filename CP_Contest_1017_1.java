import java.util.Scanner;
public class CP_Contest_1017_1{
    public static void main(String args[]){     // by other's solution we can take different three strings and display
        Scanner sc = new Scanner(System.in);    // first element of them and it gives constant time complexity O(1)
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0){
            String str = sc.nextLine();
            String newstr = new String("");
            newstr = newstr + str.charAt(0);
            for(int i = 1; i < str.length(); i++){
                if(str.charAt(i-1) == ' '){
                    newstr = newstr + str.charAt(i);
                }
            }
            System.out.println(newstr);
        }
    }
}
