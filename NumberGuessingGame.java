//CT100/G/21575/24
//WANDURI MOSES 
//WEEK 4 ACTIVITY NUMBER GUESSING GAME-

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public NumberGuessingGame() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Random random = new Random();
      int var3 = random.nextInt(20) + 1;
      int var4 = 0;
      int var5 = 0;
      System.out.println("Welcome to the Number Guessing Game!");
      System.out.println("I'm thinking of a number between 1 and 20.");

      while(var4 != var3) {
         System.out.print("Enter your guess: ");
         var4 = scanner.nextInt();
         ++var5;
         if (var4 > var3) {
            System.out.println("Too high!");
         } else if (var4 < var3) {
            System.out.println("Too low!");
         } else {
            System.out.println("Congratulations!");
            System.out.println("Total attempts: " + var5);
         }
      }

      scanner.close();
   }
}
