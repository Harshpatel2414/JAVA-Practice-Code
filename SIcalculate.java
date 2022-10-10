import java.util.*;
import java.lang.*;
import java.io.*;

public class SIcalculate {
  // Simple Interest Calculation

  /*
    Simple interest formula is given by:
    
    Simple Interest = (P x T x R)/100
    
    where, P is the principal amount
           T is the time and
           R is the rate of interest
   */

  public static void main(String[] args) throws java.lang.Exception {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter ammount : ");
    float P = sc.nextInt();
    System.out.print("Enter rate : ");
    float R = sc.nextInt();
    System.out.print("Enter time period in years : ");
    float T = sc.nextInt();
    float SI = ((P * T * R)/100);
    System.out.println("SI ammount is : "+ SI);
    if (R > 0 && R <= 100) {
      System.out.println("Your Principle ammount with Rate: " +( P + SI));       
    }

    else {
      System.out.print("Give rate between 100");
    }
  }
}