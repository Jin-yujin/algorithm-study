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
			int N = sc.nextInt();
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			int e = 0;

			while (N > 1) {
				if (N % 2 == 0) {
					N /= 2;
					a++;
				}
				if (N % 3 == 0) {
					N /= 3;
					b++;
				}
				if (N % 5 == 0) {
					N /= 5;
					c++;
				}
				if (N % 7 == 0) {
					N /= 7;
					d++;
				}
				if (N % 11 == 0) {
					N /= 11;
					e++;
				}
			}
			System.out.printf("#%d %d %d %d %d %d", test_case, a, b, c, d, e);
			System.out.println();
		}
	}
}