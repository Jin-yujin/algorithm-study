import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int sum = 0;
			char[] fun = new char[N];
			fun = sc.next().toCharArray();

			for (int i = 0; i < N; i += 2) {
				sum += Character.getNumericValue(fun[i]);
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}