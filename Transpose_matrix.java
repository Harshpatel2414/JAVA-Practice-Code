import java.util.*;
import java.lang.*;
import java.io.*;

public class Transpose_matrix
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter matrix size : ");
    int N = sc.nextInt();
    int arr[][] = new int[N][N];
    System.out.println("Enter matrix value :");
    
    for(int i=0; i<N; i++){
      for(int j=0; j<N; j++){
        arr[i][j]=sc.nextInt();
      }
    }
    int transpose[][] = new int[N][N];
    
    for(int i=0; i<N; i++){
      for(int j=0; j<N; j++){
        transpose[j][i] = arr[i][j];
      }
    }
    System.out.println("Transpose matrix is :");
    for(int i=0; i<N; i++){
      for(int j=0; j<N; j++){
        System.out.print(transpose[i][j] + " ");
      }
      System.out.println();
    }
  }
}