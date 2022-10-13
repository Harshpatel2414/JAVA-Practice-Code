import java.util.*;
import java.lang.*;
import java.io.*;

public class array_rottation {
    public static void main(String[] args) {

        /*
          John Watson knows of an operation called a right circular rotation on an
          array of integers. One rotation operation moves the last array element to the
          first position and shifts all remaining elements right one. To test the
          abilities of Sherlock , Watson provides Sherlock with an array of integers.
          Sherlock is to perform the rotation operation a number of times then
          determine the value of the element at a given position
          For each array, perform a number of right circular rotations and return the
          values of the elements at the given indices.
          Example
             arr = [3,4,5]
              k = 2
             queries = [1,2]
           Here k is the number of rotations on arr, and queries holds the list of
           indices to report. First we perform the two rotations:
                [3,4,5] -> [5,3,4] -> [4,5,3]
           Now return the values from the zero-based indices 1 and 2 as indicated in the
           queries array.
                 a[1]=5
                 a[2] = 3
         */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        int index;

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        while (k > 0) {
            int j = list.removeLast();
            list.push(j);
            k--;
        }

        while (q > 0) {
            index = in.nextInt();
            System.out.println(list.get(index));
            q--;
        }
        in.close();
    }
}
