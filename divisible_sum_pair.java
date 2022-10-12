import java.util.*;
import java.lang.*;
import java.io.*;
/*
Given an array of integers and a positive integer k, determine the number of (i,j) pairs in the array where i<j and arr[i] + arr[j] is divisible by k.

Input Format
Input consists of two lines.

The first line contains 2 space-separated integers, n and k.

The second line contains n space-separated integers, each a value of arr[i].

Output Format
Print the number of pairs a[i] + a[j] divisble by k, where i<j.

Example :

Input
6 3          
1 3 2 6 1 2

Output
5

*/
public class divisible_sum_pair {

	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        int k=sc.nextInt();
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if ( (arr[i]+arr[j] )%k ==0) count++;
            }
        }
        System.out.println(count);
    
	}

}
