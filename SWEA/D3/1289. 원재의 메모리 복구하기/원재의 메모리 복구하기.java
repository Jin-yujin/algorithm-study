import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			String bits = sc.next();
			char[] bit = new char[bits.length()];
			char[] dft = new char[bits.length()];

			for (int i = 0; i < bits.length(); i++) {
				bit[i] = bits.charAt(i);
				dft[i] = '0';
			}
			int count = 0;

			for (int i = 0; i < bits.length(); i++) {
				if (dft[i] != bit[i]) {
					if (bit[i] == '1')
						for (int j = i; j < bit.length; j++) {
							dft[j] = '1';
						}
					else
						for (int j = i; j < bit.length; j++) {
							dft[j] = '0';
						}
					count++;
				}
			}
			System.out.println("#" + test_case + " " + count);
		}
	}
}