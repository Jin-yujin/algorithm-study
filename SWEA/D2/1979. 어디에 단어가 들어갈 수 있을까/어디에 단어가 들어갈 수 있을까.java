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
			int K = sc.nextInt();
			int[][] arr = new int[N][N];
			int count = 0;

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// 가로
			for (int i = 0; i < N; i++) {
				int white = 0;
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 1) {
						white++;
					} else if (white == K && arr[i][j] == 0) {
						count++;
						white = 0;
					} else 
						white = 0;
				}
				if (white == K)
					count++;
			}

			// 세로
			for (int i = 0; i < N; i++) {
				int white = 0;
				for (int j = 0; j < N; j++) {
					if (arr[j][i] == 1) {
						white++;
					} else if (white == K && arr[j][i] == 0) {
						count++;
						white = 0;
					} else 
						white = 0;
				}
				if (white == K)
					count++;
			}

			System.out.println("#" + test_case + " " + count);
		}
	}
}