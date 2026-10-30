import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String str = sc.next();

			System.out.print("#" + test_case + " ");

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);

				if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
					System.out.print(c);
				}
			}

			System.out.println();
		}
	}
}