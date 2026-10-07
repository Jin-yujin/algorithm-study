import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

        for (int test_case = 1; test_case <= 10; test_case++) {
            int N=sc.nextInt();
            int[] bd = new int[N];
            int count=0;

            for (int i = 0; i < N; i++) {
                bd[i] = sc.nextInt();
            }

            for (int i = 2; i < N-2; i++) {
                if((bd[i]>bd[i-2])&& (bd[i]>bd[i-1])&& (bd[i]>bd[i+1])&& (bd[i]>bd[i+2])){
                    int max = Math.max(bd[i-2],bd[i-1]);
                    max = Math.max(max, bd[i+1]);
                    max = Math.max(max, bd[i+2]);

                    count+= (bd[i]-max);
                }
            }

            System.out.println("#"+test_case+" "+count);
        }
    }
}