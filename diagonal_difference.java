import java.util.*;
import java.lang.*;
import java.io.*;

//example
/*
Input
3
11 2 4
4 5 6
10 8 -12

Output
15
Explanation -
Sum across the primary diagonal: 11 + 5 + (- 12) = 4
Sum across the secondary diagonal: 4 + 5 + 10 = 19
Difference: |4 - 19| = 15       
 */
public class diagonal_difference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    x += arr[i][j];
                }
                if ((i + j) == (n - 1)) {
                    y += arr[i][j];
                }
            }
        }
        System.out.println(Math.abs(x-y));
    }
}
