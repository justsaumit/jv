import java.util.Scanner;
class Overload{
    private int x,y;
    public Overload(){
        x=0;
        y=0;
    }
    public Overload(int a, int b){
        x=a;
        y=b;
    }
    public void printElements(){
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);
    }
}

public class q7{
    public static void main(String[]args){
        Overload obj1=new Overload();
        System.out.println("For unparaterized constructor - ");
        obj1.printElements();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x for parameterized constructor: ");
        int x=sc.nextInt();
        System.out.println("Enter value of y for parameterized constructor: ");
        int y=sc.nextInt();
        System.out.println("For parameterized constructor and overloaded constructor- ");
        Overload obj2=new Overload(x,y);
        obj2.printElements();
    }
}
