//CT100/G/21575/24
//WANDURI MOSES 
//WEEK 4 ACTIVITY - WHILE LOOP- ATMWithdrawal

import java.util.Scanner;

public class ATMWithdrawal {
   public ATMWithdrawal() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double var1 = 500.0;
      System.out.println("Starting balance: $" + var1);

      while(var1 > 0.0) {
         System.out.print("Enter amount to withdraw: ");
         double var2 = scanner.nextDouble();
         var1 -= var2;
         System.out.println("Balance after withdrawal: $" + var1);
      }

      System.out.println("Account balance empty or negative. ATM closing.");
      scanner.close();
   }
}
