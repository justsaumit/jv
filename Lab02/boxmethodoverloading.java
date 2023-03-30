//6. Write a java program to find the volume of a Box using method overloading with different number of parameters.
class Box{
    double vol(float s){
        System.out.println("Enter the side of the cube box: "+s+" units");
        return s*s*s;
    }
    double vol(float r, float h){
        System.out.println("Enter the radius of the cylindrical box: "+r+" units");
        System.out.println("Enter the height of the cylindrical box: "+h+" units");
        return 3.14*r*r*h;
    }
    double vol(float l, float b, float h){
        System.out.println("Enter the length of the rectangular box: "+l+" units");
        System.out.println("Enter the breadth of the rectangular box: "+b+" units");
        System.out.println("Enter the height of the rectangular box: "+h+" units");
        return l*b*h;
    }
}

public class boxmethodoverloading{
    public static void main (String[] args){
        Box obj = new Box();
        double cubebox=obj.vol(5);
        System.out.println("Volume of the cubebox is: "+cubebox+" unit cube");
        System.out.println(" ");
        double cylbox=obj.vol(2,1);
        System.out.println("Volume of the cylindrical box is: "+cylbox+" unit cube");
        System.out.println(" ");
        double rectbox=obj.vol(9,5,2);
        System.out.println("Volume of the cube box is: "+rectbox+" unit cube");
	}
}
