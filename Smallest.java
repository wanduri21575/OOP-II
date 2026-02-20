//CT100/G/21575/24
//WANDURI MOSES 

import java.util.Scanner;
public class Smallest{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Input first number: ");
        int num1=scanner.nextInt();

         System.out.print("Input the second number: ");
         int num2=scanner.nextInt();

         System.out.print("Input the third number: ");
         int num3=scanner.nextInt();

         int smallest;
         
        scanner.close();

        if(num1<num2&&num1<num3){
          smallest=num1;
           
        }

        else if(num2<num1&&num2<num3){
        smallest=num2;
      
        }

        else if(num3<num2&&num3<num1){
          smallest = num3;
          
        }

        else{
             smallest=0;
        }
         
        System.out.print("The smallest is number: " +smallest);
        
    }

}
