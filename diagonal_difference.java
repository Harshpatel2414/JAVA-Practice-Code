import java.util.*;
import java.lang.*;
import java.io.*;

public class diagonal_difference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
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
        System.out.println(Math.abs(x - y));
    }
}
