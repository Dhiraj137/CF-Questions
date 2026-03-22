import java.util.*;

public class B_Array_merging{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read the length of arrays a and b

			// Read array a
			long[] a = new long[(int) n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong();
			}

			// Read array b
			long[] b = new long[(int) n];
			for (int i = 0; i < n; i++) {
				b[i] = scanner.nextLong();
			}

			long[] longestsubArraya = new long[(int) ( 2 * n + 1)];
			long[] longestsubArrayb = new long[(int) ( 2 * n + 1)];

			int counter = 1;
			for(int i = 1; i < n; i++){
				if(a[i] == a[i-1]){
					counter++;
				}else{
					longestsubArraya[(int) a[i-1]] = Math.max(longestsubArraya[(int) a[i-1]],counter);
					counter = 1;
				}
			}
			longestsubArraya[(int) a[(int) n-1]] = Math.max(longestsubArraya[(int) a[(int) n-1]], counter);

			counter = 1;
			for(int i = 1; i < n; i++){
				if(b[i] == b[i-1]){
					counter++;
				}else{
					longestsubArrayb[(int) b[i-1]] = Math.max(longestsubArrayb[(int) b[i-1]],counter);
					counter = 1;
				}
			}
			longestsubArrayb[(int) b[(int) n-1]] = Math.max(longestsubArrayb[(int) b[(int) n-1]], counter);

			long maxFreq = -1;
			for (int i = 1; i <= 2 * n; i++) {
				maxFreq = Math.max(maxFreq, longestsubArraya[i] + longestsubArrayb[i]);
			}

			System.out.println(maxFreq);

		}
		scanner.close();
	}
}


// Time Complexity (TC): O(n) ~ O(2*10^5)
// Space Complexity (SC): O(n) ~ O(2*10^5)
