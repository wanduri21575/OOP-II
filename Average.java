import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Input first number: ");
        int num1=scanner.nextInt();

         System.out.print("Input the second number: ");
         int num2=scanner.nextInt();

         System.out.print("Input the third number: ");
         int num3=scanner.nextInt();

         int average = (num1+num2+num3)/3;
       
        System.out.print("The average is : " +average);

    }
}