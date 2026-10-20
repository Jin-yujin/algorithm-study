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
			String munja = sc.next();

			boolean N = false;
			boolean S = false;
			boolean E = false;
			boolean W = false;

			for (int i = 0; i < munja.length(); i++) {
				char dir = munja.charAt(i);

				if (dir == 'N')
					N = true;
				else if (dir == 'S')
					S = true;
				else if (dir == 'E')
					E = true;
				else if (dir == 'W')
					W = true;
			}

			if (N == S && E == W)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}