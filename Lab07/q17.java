//Q.17 Write a java program to find the cube of a number for various data types using

import cube.Cube;
import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer value whose cube is to be calculated: ");
        int intNum = sc.nextInt();
        System.out.println("Enter an Double value whose cube is to be calculated: ");
        double doubleNum =sc.nextDouble();

        int intCube = Cube.cube(intNum);
        double doubleCube = Cube.cube(doubleNum);

        System.out.println("Cube of " + intNum + " is " + intCube);
        System.out.print("Cube of " + doubleNum + " is ");
        System.out.printf("%.2f\n", doubleCube);
    }
}

