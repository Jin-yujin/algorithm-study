import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int[] arr = new int[10];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			Arrays.sort(arr);

			int sum = 0;
			for (int i = 1; i < arr.length - 1; i++) {
				sum += arr[i];
			}

			double avg = (double) sum / (arr.length - 2);
			long avg_round = Math.round(avg);

			System.out.println("#" + test_case+" "+ avg_round);
		}
	}
}