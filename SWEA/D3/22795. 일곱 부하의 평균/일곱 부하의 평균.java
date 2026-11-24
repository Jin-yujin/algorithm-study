import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
		public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int[] leng = new int[6];
			int sum = 0;
			int max = 0;

			for (int i = 0; i < 6; i++) {
				leng[i] = sc.nextInt();
				sum += leng[i];
				max = Math.max(max, leng[i]);
			}

			max++;
			sum += max;
			int a = sum % 7;
			if (a != 0)
				max += 7 - a;

			System.out.println(max);
		}
	}
}