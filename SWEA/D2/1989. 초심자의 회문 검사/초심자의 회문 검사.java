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
			String palin = sc.next();

			char[] arr = palin.toCharArray();
			int result = 1;

			for (int i = 0; i < arr.length / 2; i++) {
				if (arr[i] != arr[arr.length - 1 - i]) {
					result = 0;
				}
			}

			System.out.println("#" + test_case + " " + result);
		}
	}
}