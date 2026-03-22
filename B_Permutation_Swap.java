import java.util.*;

public class B_Permutation_Swap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long t = scanner.nextLong(); // Read the number of test cases
		while (t-- > 0) {
			int n = scanner.nextInt(); // Read the length of the permutation
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt(); // Read the permutation elements
			}

			// Initialize k as the absolute difference between the first element and its sorted position
			int k = Math.abs(a[0] - 1);
			for (int i = 1; i < n; i++) {
				// Update k to be the gcd of current k and the absolute difference between
				// the current element and its sorted position
				k = gcd(k, Math.abs(a[i] - (i + 1)));
			}
			// Output the maximum k that can be used to sort the permutation
			System.out.println(k);
		}
		scanner.close();
	}

	// Helper method to calculate gcd of two numbers
	private static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}

// Time Complexity (TC): O(nlogn) = O(10^5*20) = O(2*10^6)
// Space Complexity (SC): O(n) = O(10^5)
