import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();
		String[] days = { "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };

		for (int test_case = 1; test_case <= T; test_case++) {
			String day = sc.next();
			int n = 0;

			for (int i = 0; i < 7; i++) {
				if (days[i].equals(day)) {
					n = 6 - i;
				}
			}
			if (n == 0)
				n = 7;

			System.out.println("#" + test_case + " " + n);

		}
	}
}