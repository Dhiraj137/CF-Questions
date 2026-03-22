import java.util.Scanner;

public class B_Ashmal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();              // FIX 1: consume newline

            String str = sc.nextLine();
            String[] arr = str.split("\\s+");

            StringBuilder s = new StringBuilder(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                if (s.toString().compareTo(arr[i]) < 0) {
                    s.append(arr[i]);
                } else if (s.toString().compareTo(arr[i]) > 0) {
                    s = new StringBuilder(arr[i]).append(s); // FIX 2
                } else {
                    s.append(arr[i]);
                }
            }
            System.out.println(s);
        }
    }
}
