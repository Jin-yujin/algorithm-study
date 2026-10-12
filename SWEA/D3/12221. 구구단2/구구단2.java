import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
		{
        	int A = sc.nextInt();
        	int B = sc.nextInt();
        	
        	if (A<10 && B>0 && B<10)
        		System.out.println("#" + test_case + " "+ A*B);
        	else 
        		System.out.println("#" + test_case + " -1");
		}
	}
}