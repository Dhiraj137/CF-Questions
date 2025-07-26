import java.util.Scanner;
public class CP_1925B {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            char[] arr = new char[26];
            char x = 'a';
            for(int i = 0; i < 26; i++){
                arr[i] = x;
                x++;
            }

            StringBuilder str = new StringBuilder("");
            while(str.length() < n*k){
                for(int i = 0; i < k; i++){
                    str.append(arr[i]);
                }
            }
            System.out.println(str);
        }
    }
}
