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
			String str = sc.next();
			String ans = sc.next();
			int count = 0;
			char[] ch = new char[N];

			for (int i = 0; i < N; i++) {
				ch[i] = str.charAt(i);
			}

			for (int i = 0; i < N; i++) {
				char an = ans.charAt(i);

				if (an == ch[i])
					count++;
			}

			System.out.println("#" + test_case + " " + count);
		}
	}
}