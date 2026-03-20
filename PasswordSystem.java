//CT100/G/21575/24
//WANDURI MOSES 
//WEEK 4 ACTIVITY - WHILE LOOP- ATMWithdrawal

import java.util.Scanner;

public class PasswordSystem {
   public PasswordSystem() {
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String var1 = "1234";

      String var2;
      do {
         System.out.print("Enter password: ");
         var2 = scanner.nextLine();
      } while(!var2.equals(var1));

      System.out.println("Access Granted!");
      scanner.close();
   }
}
