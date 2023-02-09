import java.util.Scanner;
class copyConstructor{
    private int x;
    private int y;
    public copyConstructor(){
        x=2;
        y=3;
    }
    public copyConstructor(int a, int b){
        x=a;
        y=b;
    }
    public copyConstructor(copyConstructor obj){
        x=obj.x;
        y=obj.y;
    }
    public void printValue(){
        System.out.println("The value of x is: "+x);
        System.out.println("The value of y is: "+y);
    }
}

public class q9{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("For Constructor with no parameters - ");
        copyConstructor obj1 = new copyConstructor();
        obj1.printValue();
        System.out.println("Enter values of x and y: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("For Constructor with two parameters - ");
        copyConstructor obj2 = new copyConstructor(x,y);
        obj2.printValue();
        System.out.println("For Copy Constructor - ");
        copyConstructor obj3 = new copyConstructor(obj2);
        obj3.printValue();
    }
}
