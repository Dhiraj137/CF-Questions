import java.util.Scanner;
public class A_Cupboards{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] l = new int[n];
        int[] r = new int[n];

        for(int i = 0; i < n; i++){
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }

        int lz = 0;
        int lo = 0;
        int rz = 0;
        int ro = 0;
        for(int i = 0; i < n; i++){
            if(l[i] == 0){
                lz++;
            }else{
                lo++;
            }

            if(r[i] == 0){
                rz++;
            }else{
                ro++;
            }
        }

        System.out.println(Math.min(lz,lo)+Math.min(rz,ro));
    }
}   