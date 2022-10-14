import java.util.*;
import java.lang.*;
import java.io.*;

public class array_90degree_rot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] matrix = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int y = 0; y < matrix.length / 2; y++) {
            for (int x = y; x < matrix.length - y - 1; x++) {
                int temp = matrix[y][x];
                matrix[y][x] = matrix[matrix.length - x - 1][y];
                matrix[matrix.length - 1 - x][y] = matrix[matrix.length - 1 - y][matrix.length - 1 - x];
                matrix[matrix.length - 1 - y][matrix.length - 1 - x] = matrix[x][matrix.length - 1 - y];
                matrix[x][matrix.length - 1 - y] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}