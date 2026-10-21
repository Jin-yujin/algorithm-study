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
			int[][] arr = new int[N][N];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int max = 0;

			for (int i = 0; i < N - M + 1; i++) {
				for (int j = 0; j < N - M + 1; j++) {
					int hap = 0;
					
					for (int k = 0; k < M; k++) {
						for (int k2 = 0; k2 < M; k2++) {
							hap += arr[i+k][j+k2] ;
						}
					}

					if (max < hap)
						max = hap;
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}
}