import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		for (int test_case = 1; test_case <= T; test_case++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int count = 0;

			while (B >= C) {
				if (B > 1) {
					B--;
					count++;
				} else
					break;
			}
			while (A >= B) {
				if (A > 0) {
					A--;
					count++;
				} else
					break;
			}

			if (0 < A && A < B && B < C)
				System.out.println("#" + test_case + " " + count);
			else
				System.out.println("#" + test_case + " -1");
		}
	}
}