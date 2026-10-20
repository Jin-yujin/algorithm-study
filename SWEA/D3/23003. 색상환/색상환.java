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
			String[] color = { "red", "orange", "yellow", "green", "blue", "purple" };
			String color1 = sc.next();
			String color2 = sc.next();
			String result = "X";

			int color1_i = 0;
			int color2_i = 0;

			for (int i = 0; i < color.length; i++) {
				if (color[i].equals(color1)) {
					color1_i = i;
				}
                if (color[i].equals(color2)) {
					color2_i = i;
				}
				else 
					continue;
			}

			if ((color1_i - color2_i == 1) || (color2_i - color1_i == 1) || (color1_i - color2_i == 5)
					|| (color2_i - color1_i == 5)) {
				result = "A";
			} else if ((color1_i - color2_i == 3) || (color2_i - color1_i == 3)) {
				result = "C";
			} else if (color1.equals(color2)) {
				result = "E";
			} else
				result = "X";

			System.out.println(result);
		}
	}
}