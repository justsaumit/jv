//22. Write a java program using Number Format exception
import java.util.Scanner;
public class NumberFormatException{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers on which you'd wish to perform division operation: ");
        String strnum1 = sc.nextLine();
        String strnum2 = sc.nextLine();
        try {
            int num1 = Integer.parseInt(strnum1);
            int num2 = Integer.parseInt(strnum2);
            double result = (double) num1 / num2;
            System.out.println("The result of dividing "+num2+" from "+num1+" is: "+result);
        } 
        catch (ArithmeticException ae){
            System.out.println("Error: Cannot divide by zero");
            System.out.println(ae.toString());
        }
        catch (NumberFormatException nfe) {
            System.out.println("Error: Input must be an integer!");
        }
//        catch (NumberFormatException nfe) {
//            System.out.println("Error: Invalid data types are entered, number must be an integer.");
            //System.out.println("Exception thrown: " +nfe);
       // } 
    }
}
