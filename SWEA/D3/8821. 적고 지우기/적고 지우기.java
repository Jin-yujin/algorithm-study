import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            String number = sc.next();
            char[] ten = number.toCharArray();
            boolean[] num = new boolean[10];

            for (int i = 0; i < ten.length; i++) {
                int n = (int)ten[i]-'0';

                if(num[n])
                    num[n] = false;
                else
                    num[n] = true;
            }

            int count = 0;
            for (int i = 0; i < num.length; i++) {
                if(num[i])
                    count++;
            }

            System.out.println("#"+test_case+" "+count);
        }
    }
}