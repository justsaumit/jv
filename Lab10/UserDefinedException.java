//23. Write a java program for user defined exception
import java.util.Scanner;
class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

public class UserDefinedException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try{
            if(age<18)
                throw new InvalidAgeException("You are not eligible to vote.");
            else
                System.out.println("You are eligible to vote!");
        }
        catch(Exception e){
            System.out.println("Exception occurred: " + e);
        }
    }
}
