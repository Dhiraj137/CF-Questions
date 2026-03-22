import java.util.Scanner;
public class B_Above_the_Clouds{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while(t-- > 0){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            StringBuffer a = new StringBuffer("" + str.charAt(0));
            StringBuffer b = new StringBuffer("" + str.charAt(n-1));

            boolean flag = true;
            for(int i = 1; i < n-1; i++){
                if(a.indexOf("" + str.charAt(i)) != -1 || b.indexOf("" + str.charAt(i)) != -1){
                    System.out.println("Yes");
                    flag = false;
                    break;
                }else{
                    a.append(str.charAt(i));
                }
            }

            if(flag){
                System.out.println("No");
            }
        }
    }
}