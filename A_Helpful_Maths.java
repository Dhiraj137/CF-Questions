import java.util.Arrays;
import java.util.Scanner;

public class A_Helpful_Maths{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] parts = str.split("\\+");
        int[] num = new int[parts.length];

        for(int i = 0; i < parts.length; i++){
            num[i] = Integer.parseInt(parts[i]);
        }
        
        Arrays.sort(num);

        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if(i != num.length-1){
                System.out.print("+");
            }
        }
    }
}