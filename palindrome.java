import java.io.*;
import java.util.*;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        for (int j = (A.length() - 1); j < A.length(); --j) {
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) == A.charAt(j)) {
                    System.out.println("Yes");
                    break;
                } else {
                    System.out.println("No");
                    break;
                }
            }
            break;
        }
    }
}
