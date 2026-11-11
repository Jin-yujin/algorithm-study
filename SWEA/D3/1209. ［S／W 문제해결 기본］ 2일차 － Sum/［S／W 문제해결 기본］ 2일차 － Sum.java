import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
        
		for (int test_case = 1; test_case <= 10; test_case++) {
			int t = sc.nextInt();
			int max = 0;
			int[][] arr = new int[100][100];

			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int sum_cross = 0;
			int sum_re_cross = 0;
			
			for (int i = 0; i < 100; i++) {
				int sum_r = 0;
				int sum_c = 0;

				for (int j = 0; j < 100; j++) {
					sum_r += arr[i][j];
					sum_c += arr[j][i];
				}
				
				sum_cross += arr[i][i];
				sum_re_cross += arr[99 - i][i];

				max = Math.max(max, sum_r);
				max = Math.max(max, sum_c);
				max = Math.max(max, sum_cross);
				max = Math.max(max, sum_re_cross);
			}

			System.out.println("#" + t + " " + max);
		}
	}
}