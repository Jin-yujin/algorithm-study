import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
		public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			boolean t = false;

			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					if (i * j == N) {
						t = true;
						break;
					}
				}
				if (t)
					break;
			}
			if (t)
				System.out.println("#" + test_case + " Yes");
			else
				System.out.println("#" + test_case + " No");
		}
	}
}