import java.util.*;
import java.lang.*;
import java.io.*;

public class contains_duplicates {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    k++;
                    break;
                }
            }
        }
        if (k == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
