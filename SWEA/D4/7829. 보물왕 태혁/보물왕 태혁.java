import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int P = sc.nextInt();
			int[] arr = new int[P];
			for (int i = 0; i < P; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int ans = arr[0]*arr[P-1];			
			
			System.out.println("#" + test_case + " " + ans);
		}
	}
}