//Q15 Write a Java program to demonstrate use of user defined packages.
//This is the main program where user-defined package is being imported

import saumitpkg.printer;

public class q15 {
    public static void main(String[] args) {
        printer obj = new printer(); // Create an instance of the user-defined class printer
        obj.disp();                 // Call the disp method from the user-defined class printer
        }
}
