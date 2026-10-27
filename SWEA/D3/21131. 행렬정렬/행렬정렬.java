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
			int[][] arr = new int[N][N];
			int count = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			for (int i = N - 1; i >= 0; i--) {
				if (arr[0][i] != i + 1) {

					for (int j = 0; j < i; j++) {
						int temp = arr[0][j];
						arr[0][j] = arr[j][0];
						arr[j][0] = temp;
					}
					count++;
				}
			}

			System.out.println(count);
		}
	}
}