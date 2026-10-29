import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			char[] str = sc.next().toCharArray();
			int count = 0;
			String result = "No";

			for (int i = 1; i < 4; i++) {
				if (str[0] == str[i]) {
					count++;
				}
			}

			if (count == 1) {
				if (str[0] != str[1] && (str[1] == str[2] || str[1] == str[3]))
					result = "Yes";
				else if (str[0] == str[1] && str[2] == str[3])
					result = "Yes";
			}
			System.out.println("#" + test_case + " " + result);
		}
	}
}