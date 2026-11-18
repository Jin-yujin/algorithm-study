import java.util.Scanner;
import java.util.Arrays;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int A_N = sc.nextInt();
			int B_N = sc.nextInt();
			int[] A = new int[A_N];
			int[] B = new int[B_N];

			for (int i = 0; i < A_N; i++) {
				A[i] = sc.nextInt();
			}
			for (int i = 0; i < B_N; i++) {
				B[i] = sc.nextInt();
			}

			boolean s = true;

			if (A_N == B_N) {
				Arrays.sort(A);
				Arrays.sort(B);

				for (int i = 0; i < A_N; i++) {
					if (A[i] != B[i]) {
						s = false;
						break;
					}
				}
				if (s)
					System.out.println("=");

			} else if (A_N > B_N) {
				boolean[] ss = new boolean[B_N];
				for (int i = 0; i < B_N; i++) {
					for (int j = 0; j < A_N; j++) {
						if (B[i] == A[j]) {
							ss[i] = true;
							break;
						}
					}
					if (!ss[i]) {
						s = false;
						break;
					}
				}
				if (s)
					System.out.println(">");
				
			} else { // A_N < B_N
				boolean[] ss = new boolean[A_N];
				for (int i = 0; i < A_N; i++) {
					for (int j = 0; j < B_N; j++) {
						if (A[i] == B[j]) {
							ss[i] = true;
							break;
						}
					}
					if (!ss[i]) {
						s = false;
						break;
					}
				}
				
				if (s)
					System.out.println("<");
			}

			if (!s)
				System.out.println("?");
		}
	}
}