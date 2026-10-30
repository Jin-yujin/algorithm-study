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

			for (int i = 0; i < str.length; i++) {
				if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
					str[i] = ' ';
				}
			}

			System.out.print("#" + test_case + " ");

			for (int j = 0; j < str.length; j++) {
				if (str[j] != ' ') {
					System.out.print(str[j]);
				}
			}
			System.out.println();
		}
	}
}