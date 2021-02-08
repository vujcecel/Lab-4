/*
Lab 4
Partners: Evan Vujcec and Sam Green
Date: 08-02-2021
*/

import java.util.Random;

class Main {
  public static void main(String[] args) {

    // Generate number
    Random r = new Random();
    int randomNum = 1 + r.nextInt(50);

    // Print number and countdown
    System.out.printf("The Random number is: %d%n", randomNum);
    for (int x = randomNum; x >= 0; x--)       
      System.out.println(x);

    // Print message
    if (randomNum <= 15)
      System.out.println("Ahoy mateys!");
    else if (randomNum < 42 && randomNum > 20)
      System.out.println("Cannonball!");
    else
      System.out.println("Look, a sea shanty!");
  }
}