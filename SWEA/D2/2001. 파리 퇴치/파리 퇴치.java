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
			int M = sc.nextInt();
			int[][] arr_N = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr_N[i][j] = sc.nextInt();
				}
			}
			int max = 0;
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					int sum = 0;

					for (int x = i; x < i+M; x++) {
						for (int z = j; z < j+M; z++) {
							sum += arr_N[x][z];
						}
					}
					if (sum > max) {
						max = sum;
					}
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}
}