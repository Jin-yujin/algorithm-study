import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int[] check = new int[10];
			int count = 0;

			char[] num = sc.next().toCharArray();

			for (int i = 0; i < num.length; i++) {
				int n = (int) (num[i] - 48);
				check[n]++;
			}

			for (int i = 0; i < 10; i++) {
				if (check[i] != 0)
					count++;
			}

			System.out.println("#" + test_case + " " + count);
		}
	}
}