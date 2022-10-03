import java.util.Scanner;
public class NumberTable {
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
      System.out.print("Which number table you want, Enter the number here : ");
      int n = scan.nextInt();

      for( int i=1; i<=10; i++){
          System.out.printf("%d X %d = %d\n", n, i, n*i);
      }
    } 
}
