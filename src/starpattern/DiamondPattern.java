package starpattern;

import java.util.Scanner;

public class DiamondPattern {
  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    System.out.print("Enter number of rows (odd number only): ");
//    int n = sc.nextInt();
//
//    if (n % 2 == 0) {
//      System.out.println("Enter odd number only.");
//    } else {
//      for (int i = 1; i <= n; i += 2) {
//        for (int j = 0; j < (n - i) / 2; j++) {
//          System.out.print(" ");
//        }
//        for (int j = 1; j <= i; j++) {
//          System.out.print("*");
//        }
//        System.out.println();
//      }
//      for (int i = n - 2; i >= 1; i -= 2) {
//        for (int j = 0; j < (n - i) / 2; j++) {
//          System.out.print(" ");
//        }
//        for (int j = 1; j <= i; j++) {
//          System.out.print("*");
//        }
//        System.out.println();
//      }
//    }
	  
	
		    int n = 5;
		    for (int i = 1; i <= n; i++) {
		      for (int j = n - i; j >= 1; j--) {
		        System.out.print(" ");
		      }
		      for (int k = 1; k <= 2 * i - 1; k++) {
		        System.out.print("*");
		      }
		      System.out.println();
		    }
//		    for (int i = n - 1; i >= 1; i--) {
//		      for (int j = n - i; j >= 1; j--) {
//		        System.out.print(" ");
//		      }
//		      for (int k = 1; k <= 2 * i - 1; k++) {
//		        System.out.print("*");
//		      }
//		      System.out.println();
//		    }
		  }
		

  
}
