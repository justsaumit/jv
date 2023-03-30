//20. Write a java program  to demonstrate simple example for exception handling
import java.util.Scanner;
public class DividebyZero{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers on which you'd wish to perform division operation: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try {
            double result = (double) num1 / num2;
            System.out.println("The result of dividing "+num2+" from "+num1+" is: "+result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
    }
}
