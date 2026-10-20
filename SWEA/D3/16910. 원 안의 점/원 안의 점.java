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
			int cnt = 0;

			for (int x = -N; x <= N; x++) {
				for (int y = -N; y <= N; y++) {
					if (x * x + y * y <= N * N)
						cnt++;
				}
			}
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}