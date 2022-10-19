import java.util.*;
import java.lang.*;
import java.io.*;

public class diagonal_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0; // first Diagonal sum
        int y = 0; //second diagonal sum
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
                if ((i + j) == (n - 1) && (i != j)) {
                    y += arr[i][j];
                }
            }
        }
        System.out.println("Diagonal sum of matrix is: " + (x+y));
    }
}
