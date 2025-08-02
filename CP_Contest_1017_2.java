import java.util.Scanner;

public class CP_Contest_1017_2 {
    public static void main(String args[]){     // solution by others
        Scanner sc = new Scanner(System.in);    // we have to just shrink range of l and r by d = r-l
        int t = sc.nextInt();                   // and we know l <= 0 and r >= 0
        while(t-- >0 ){                         // so try ro shring l2 = l+d and check l2 <= 0 if yes display l2,r
            int count = 0;                      // else display -d,0 because if above condition is not satisfied
            int n = sc.nextInt();               //  then l is less than -m
            int m = sc.nextInt();               //time complexity is constant
            int l = sc.nextInt();
            int r = sc.nextInt();
            for(int i = l; i <= r; i++){
                for(int j = i+1; j <= r; j++){
                    if(j-i == m && ((i <= 0 && j >= 0) || ((j <= 0 && i >= 0))) && count ==0){
                        System.out.println(i+" "+j);
                        count = 1;
                    }
                }
            }
        }
    }
}
