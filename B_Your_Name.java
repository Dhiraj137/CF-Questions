import java.util.Arrays;
import java.util.Scanner;

public class B_Your_Name{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        while(q-- > 0){
            int n = sc.nextInt();
            char[] str1 = sc.next().toCharArray();
            char[] str2 = sc.next().toCharArray();
            
            Arrays.sort(str1);
            Arrays.sort(str2);

            boolean flag = true;
            for(int i = 0; i < n; i++){
                if(str1[i] != str2[i]){
                    flag = false;
                    break;
                }
            }

            if(flag){System.out.println("YES");}
            else{System.out.println("NO");}
 
        }
        
    }
}