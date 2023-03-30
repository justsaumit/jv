//5. Write a java program to demonstrate method overloading
class Adder{
    void add(){
        System.out.println("No parameters provided!");
    }
    void add(int a){
        System.out.println("The result of total addition of a is: " + a);
    }
    int add(int a, int b){
        System.out.println("Enter integer values for a and b: "+ a +" "+ b);
        return a+b;
    }
    double add(double a, double b){
        System.out.println("Enter double values for a and b: "+a+" "+ b);
        return a+b;
    }
}

public class methodoverloading{
    public static void main (String[] args){
        Adder obj = new Adder();
        double result;
        obj.add();
        obj.add(10);
        result = obj.add(10,20);
        System.out.println("Result of total addition of integer a and b: " + result);
        result = obj.add(5.5,3.3);
        System.out.println("Result of total addition of double value of a and b: " + result);
	}
}
