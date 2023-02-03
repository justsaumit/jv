// Q.10 Write a Java program for Rectangle class using Single Inheritance 
import java.util.Scanner;

class Shape {
    public int length;
    public int breadth;
}

class Rectangle extends Shape {
    public void setRectangle (int x, int y){
        length=x;
        breadth=y;
    }
    private int area;
    public int getArea() {
        area=length*breadth;
        return area;
    }
}

class Box extends Rectangle {
   private int height;
   public void setBox(int x, int y, int z) {
        setRectangle(x,y);
        height=z;
    }
   private int volume;
   public int getVolume() {
       volume=getArea()*height;
       return volume;
   }
}

public class q11{
    public static void main(String[] args){
        int l,b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth for the rectangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
        Rectangle obj1 = new Rectangle();
        obj1.setRectangle(l,b);
        System.out.println("Area of rectangle is: " + obj1.getArea());
        System.out.println();
        System.out.println("Enter the length, breadth and height for the rectangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        Box obj2 = new Box();
        obj2.setBox(l,b,h);
        System.out.println("Volume of rectangular box is: " + obj2.getVolume());
   }
}
