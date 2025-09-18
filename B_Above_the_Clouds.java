import java.util.Scanner;
public class B_Above_the_Clouds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String s = sc.next();
            String b = s.substring(1,n-1);
            String a_c = s.substring(0,1)+s.substring(n-1);

            if(n == 3){
                if(a_c.contains(b))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }else{
                for(int i = 0; i < b.length(); i++){
                    for(int j = i+1; j < b.length(); j++){
                        if(b.charAt(i) == b.charAt(j)){
                            System.out.println("Yes");
                            break;
                        }
                    }
                }
                System.out.println("NO");
            }

        }
    }
}