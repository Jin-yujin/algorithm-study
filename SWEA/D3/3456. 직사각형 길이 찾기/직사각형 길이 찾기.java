import java.util.Scanner;
import java.io.FileInputStream;

class Solution{
		public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();

			if (n1 == n2) {
				System.out.println("#" + test_case + " " + n3);
			} else if (n1 == n3)
				System.out.println("#" + test_case + " " + n2);
			else
				System.out.println("#" + test_case + " " + n1);
		}
	}
}