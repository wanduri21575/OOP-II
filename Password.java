Java code online
import java.util.Scanner;
public class Password{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("A password must have atleast eight characters. ");
         
         System.out.println("A password consist of only letters and digits. ");
         
         System.out.println("A password must contain atleast two digits. ");
        
        System.out.println("Input a password(you are agreeing to the above terms and conditions);");
        String password=scanner.nextLine();
        System.out.println("Password is "+password);
    }
}
