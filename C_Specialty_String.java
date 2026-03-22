import java.util.*;

public class C_Specialty_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            String str = sc.next();

            if(n == 1){
                System.out.println("NO");
                continue;
            }

            int[] alpha = new int[26];
            Arrays.fill(alpha,0);

            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                alpha[ch-'a']++;
            }
            boolean flag = false;
            for(int i = 0; i < alpha.length; i++){
                if(alpha[i] % 2 == 1){
                    flag = true;
                    break;
                }
            }
            
            if(flag){
                System.out.println("NO");
                continue;
            }

            StringBuilder st = new StringBuilder("");
            st.append(str);

            while(st.length() > 2 && st.charAt(0) == st.charAt(1)){
                st = st.delete(0,2);
            }
            while(st.length() > 2 && st.charAt(st.length()-2) == st.charAt(st.length()-1)){
                st = st.delete(st.length()-2,st.length());
            }

            boolean found = true;

            while (found) {
                found = false;
                for (int i = 0; i < st.length() - 1; i++) {
                    if (st.charAt(i) == st.charAt(i + 1)) {
                        st.delete(i, i + 2); 
                        found = true;
                        break; 
                    }
                }
            }

            if (st.length() == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}