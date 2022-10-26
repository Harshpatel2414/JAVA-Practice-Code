import java.util.*;

public class table_method {
    // logic method
    static void table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * a);
        }
    }
    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int x = sc.nextInt();
        System.out.println("Table of " + x + " is :");
        table(x);
    }
}