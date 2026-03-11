import java.util.Scanner;

class BankProgram{
    float time;
    double rate;
    static double principal;

    public static SimpleInterest(double principal,float time,double rate){
        return principal*time*rate/100;

    }

    public static compoundInterest(double principal,float time,double rate){
        return principal*math.pow(1+rate/100,time)-principal ;

    }
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
       
      System.out.println("Enter age: ");
      int age = scanner.nextInt();

      System.out.println("Enter Salary: ");
      double salary = scanner.nextDouble();

      if(age>=21 && salary >= 21000){
        System.out.println("Congratulations you qualify for a loan.");
        salary= principal;
         System.out.println("simple interest is: " + simpleInterest(principal,time,rate));
        System.out.println("compound interest is: " +compoundInterest(principal,time,rate));
      }
      else{
        System.out.println("Unfortunately, we are unable to offer you a loan at this time .");
      }
    scanner.close();
    }
}