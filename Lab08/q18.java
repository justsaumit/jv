//LAB 8: Interfaces
//Q18.Write a Java program to illustrate the multiple inheritance by using Interfaces.
import java.util.Scanner;

interface Addition{
    void add(int a, int b);
}
interface Subtraction{
    void subtract(int a, int b);
}
interface Multiplication{
    void multiply(int a, int b);
}

class Calculator implements Addition, Subtraction, Multiplication{
    public void add(int a, int b){
        System.out.println("The sum of the two numbers is: "+(a+b));
    }
    public void subtract(int a, int b){
        System.out.println("The difference of the two numbers is: "+(a-b));
    }
    public void multiply(int a, int b){
        System.out.println("The product of the two numbers is: "+(a*b));
    }
}

public class q18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        int x,y;
        outer:
        while(true){
            System.out.println("-------------------------------");
            System.out.println("Welcome to the Calculator Program, which Mathematical operation would you like to perform?");
            System.out.println("1)Addition"+"\n"+"2)Subtraction"+"\n"+"3)Multiplication"+"\n"+"4)Exit");
            int opt=sc.nextInt();
            switch(opt){
                case 1:
                    System.out.println("Enter two numbers");
                    x=sc.nextInt();
                    y=sc.nextInt();
                    calc.add(x,y);
                    break;
                case 2:
                    System.out.println("Enter two numbers");
                    x=sc.nextInt();
                    y=sc.nextInt();
                    calc.subtract(x,y);
                    break;
                case 3:
                    System.out.println("Enter two numbers");
                    x=sc.nextInt();
                    y=sc.nextInt();
                    calc.multiply(x,y);
                    break;
                case 4:
                    System.out.println("Exiting the program! Thank you");
                    break outer;
                default:
                    System.out.println("Incorrect option provided! Try Again");
            }
        }
    }
}
