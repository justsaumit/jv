// Q.13 Write a java program to demonstrate Method overriding (use super keyword)

class Parent{
    int age=40;
    public void intro(){
        System.out.println("Hello! I'm Parent! My Age is "+age);
    }
}

class Child extends Parent{
    public void intro(){
    int age=14;
        System.out.println("Hello! I'm Child! My Age is "+age);
    } //method override by child class

     public void useParentIntroMethod(){
        super.intro();
    } //Preventing override using super keyword
}

public class q13{
    public static void main(String []args){
        Parent p=new Parent();
        p.intro();               //Base class method works on calling object p
        Child c=new Child();    
        c.intro();              //On calling intro method the child class overrides the Parent's method 
                                //useParentIntroMethod() - By using super keyword we are now able to get result of parents method from child class
    }
    
}
