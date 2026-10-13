import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int max = 0;

        for (int i = 0; i < n-2; i++) {
            for (int l = 0; l < n-2; l++) {
            int count = 0;

            for (int j = i; j < i+3; j++) {
                for (int k = l; k < l+3; k++) {
                    if(grid[j][k]==1){
                        count ++;
                    }
                }
            }
            max = Math.max(max, count);
        
        }
        }
    
        System.out.println(max);
    }
}