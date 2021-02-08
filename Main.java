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
    int randNum = 1 + r.nextInt(50);

    // Print number and countdown
    System.out.printf("The Random number is: %d%n", randNum);
    for (int x = randNum; x >= 0; x--)       
      System.out.println(x);

    // Print message
    if (randNum <= 15)
      System.out.println("Ahoy mateys!");
    else if (randNum > 20 && randNum < 42)
      System.out.println("Cannonball!");
    else
      System.out.println("Look, a sea shanty!");
  }
}