import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Stack;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			String str = sc.next();

			Stack<Character> stack = new Stack<>();

			for (int i = 0; i < N; i++) {
				char num = str.charAt(i);

				if (!stack.isEmpty() && stack.peek() == num) {
					stack.pop();
				} else {
					stack.push(num);
				}
			}

			StringBuilder sb = new StringBuilder();

			while (!stack.isEmpty()) {
				sb.append(stack.pop());
			}

			System.out.println("#" + test_case + " " + sb.reverse());
		}
	}
}