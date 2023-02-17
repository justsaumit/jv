//Write a java program to create an abstract class named shape that contains 
// two integers and an empty method named printArea(). 
// Provide three classes named  Rectangle,  Triangle  and  Circle  such  that  each  one  of  the  classes extends the class shape. 
// Each one of the class contains only the method

import java.util.Scanner;

abstract class Shape {
    protected int length;
    protected int breadth;

    public Shape(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int l, int b) {
        super(l, b);
    }

    public void printArea() {
        System.out.println("The area of the rectangle is: " + (length * breadth));
    }
}

class Triangle extends Shape {
    public Triangle(int bs, int h) {
        super(bs, h); // use length and breadth for base and height
    }

    public void printArea() {
        System.out.println("The area of of triangle is: " + ((length * breadth)/2));
    }
}

class Circle extends Shape {
    public Circle(int r) {
        super(r, r); // use length and breadth for radius
    }
    public void printArea() {
        double area = Math.PI * length * breadth;
        System.out.println("The area of circle is: " + area);
    }
}

public class q14 {
    public static void main(String[] args) {
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth for the rectangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
        Shape Rectangle = new Rectangle(l, b);
        Rectangle.printArea();

        System.out.println("Enter the base and height for the right-angled triangle: ");
        l=sc.nextInt();
        b=sc.nextInt();
        Shape Triangle = new Triangle(l, b);
        Triangle.printArea();

        System.out.println("Enter the radius for the circle: ");
        l=sc.nextInt();
        Shape Circle = new Circle(l);
        Circle.printArea(); 
    }
}
