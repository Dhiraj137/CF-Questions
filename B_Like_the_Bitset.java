import java.util.Scanner;
public class B_Like_the_Bitset{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int[] arr = new int[str.length()];

            int count = 0;
            boolean check = true; 
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1'){
                    count++;
                }else{
                    if(count >= k){
                        check = false;
                    }
                    count = 0;
                }
            }

            if(count >= k){
              check = false;  
            } 

            if(!check){
                System.out.println("NO");
                continue;
            }

            int val = 1;
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '1'){
                    arr[i] = val++;
                }
            }
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == '0'){
                    arr[i] = val++;
                }
            }
            System.out.println("YES");
            for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + " ");
            }
            System.out.println();
            
        }
    }
}