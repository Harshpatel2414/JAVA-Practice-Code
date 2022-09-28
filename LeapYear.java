// Code by Harshal

// Question -
// A Leap year is the year that is multiple of 4. But,
// multiples of 100 which are not multiples of 400 are not leap years.

import java.util.Scanner;

public class LeapYear {
  public static void main(String[] args) {


	    Scanner scan = new Scanner(System.in);
      System.out.print("Enter the year : ");
      int a= scan.nextInt();

      if (a%4 == 0){
        if(a%100 == 0){
          if (a%400 != 0){
            System.out.println("It is not a leap year!");
          }    
          else{
            System.out.println("It is a leap year!");
          }            
        }
        else{
          System.out.println("It is a leap year!");
        }   
      }
      else{
       System.out.println("It is not a leap year!");
      }
	}
}
