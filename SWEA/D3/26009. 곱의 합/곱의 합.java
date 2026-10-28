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
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();

			long m = 998244353;

			long x = (a * (a + 1) / 2) % m;
			long y = (b * (b + 1) / 2) % m;
			long z = (c * (c + 1) / 2) % m;

//			long result = (x * y * z) % m;
			long result = (x * y) % m;
			result = (result * z) % m;

			System.out.println(result);
		}
	}
}