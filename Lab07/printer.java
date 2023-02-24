//Q15 Write a Java program to demonstrate use of user defined packages.
//This is a class in user-defined package
///A user-defined package in java is a package which is created by the programmer/user
///compile- javac -d . saumitpkg.java
//run - java saumitpkg.printer
///pr-def-prot-pub
///withinclass/package/subclass/outside
///0111-0011-0001-0000

package saumitpkg;

public class printer {
    public void disp(){
        System.out.println("Hello from package - saumit-pkg");
    }
 // public static void main(String[] args) {
 //     printer obj=new printer();
 //     obj.show();
 // }
}
