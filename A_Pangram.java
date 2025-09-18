import java.util.Scanner;

public class A_Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();
        
        s = s.toLowerCase();  // normalize case

        boolean[] check = new boolean[26]; // marks presence of each letter

        // mark letters found in the string
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            check[ch - 'a'] = true;
        }

        // verify all 26 letters
        for (int i = 0; i < 26; i++) {
            if (!check[i]) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
