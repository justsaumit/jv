import java.util.Scanner;
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        length=0;
        breadth=0;
    }
    public Rectangle(int side){
        length=side;
        breadth=side;
    }
    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public void printArea(){
        System.out.println("Area is: "+length*breadth);
    }
}

public class q8{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Rectangle rect0= new Rectangle();
        System.out.println("For Rectangle with 0 sides");
        rect0.printArea();
        System.out.println("Enter side for square: ");
        int side=sc.nextInt();
        System.out.println("For Rectangle with both sides of same length (Square)");
        Rectangle rect1= new Rectangle(side);
        rect1.printArea();
        System.out.println("Enter length for rectangle: ");
        int l=sc.nextInt();
        System.out.println("Enter breadth for rectangle: ");
        int b=sc.nextInt();
        System.out.println("For Rectangle with length and breadth");
        Rectangle rect2= new Rectangle(l,b);
        rect2.printArea();
    }
}
