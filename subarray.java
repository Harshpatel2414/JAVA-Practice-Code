/*
We define the following:

A subarray of an n element array is an array composed from a contiguous block
of the original array's elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.
*/
import java.io.*;
import java.util.*;

public class subarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int x = 0;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if (sum < 0) {
                    x++;
                }
            }
        }
        System.out.println(x);
    }
}
