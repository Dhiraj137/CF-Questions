import java.util.Scanner;
public class A_Anton_and_Danik{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int countA = 0;
        int countD = 0;
        
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'A'){
                countA++;
            }else{
                countD++;
            }
        }
        
        if(countA > countD){
            System.out.println("Anton");
        }else if(countD > countA){
            System.out.println("Danik");
        }else{
            System.out.println("Friendship");
        }

    }
}