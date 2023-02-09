// Q.10 Write a Java program for Rectangle class using Single Inheritance 
import java.util.Scanner;
class Shape {
    public int length;
    public int breadth;
}

class Rectangle extends Shape {
    public Rectangle (int x, int y){
        length=x;
        breadth=y;
    }
    public int area;
    int getArea() {
        area=length*breadth;
        return area;
    }
}

public class q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth for the rectangle");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Rectangle obj = new Rectangle(l,b);
        System.out.println("Area of rectangle is: " + obj.getArea());
   }
}
