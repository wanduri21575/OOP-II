//CT100/G/21575/24
//WANDURI MOSES KAMAU
//WEEK 1 ASSIGNMENT part 2 java basics----user input167

import java.util.Scanner;

class Details {//variable declaration
    float height;
    double bankBalance;
    String telNumber;
    
    public static void main(String[] args) {
        //prompting user to enter details
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height in cm: ");
        float height =scanner.nextFloat();
        
        System.out.println("Enter Bank balancein Ksh.: ");
        double bankBalance =scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Enter telephone number: ");
        String telNumber =scanner.nextLine();
        
        //printing details entered by the user
        System.out.println("Your height is: " +height +"cm");
         System.out.println("Your bank balance is : Ksh. " +bankBalance);
          System.out.println("Your telephone number  is: " +telNumber);
          scanner.close();
    }
}