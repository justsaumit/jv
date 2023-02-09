// Q.12 Write a java program for Bank class using Method Overriding.
import java.util.Scanner;

class Bank {
    public double getRateofInterest(){
        return 8.50;
    }
}

class HDFC extends Bank {
    public double getRateofInterest(){
        return 8.75;
    }
}

class ICICI extends Bank {
    public double getRateofInterest(){
        return 7.50;
    }
}

class Citibank extends Bank {
    public double getRateofInterest(){
        return 7.25;
    }
}


class q12{  
public static void main(String[] args){
        Bank b;
        Scanner sc = new Scanner(System.in);
        outer:
        while (true){
            System.out.println("------------------------------------------------------");
            System.out.println("Which Bank's Rate of Interest would you like to know?");
            System.out.println("1) Default Bank"+"\n"+"2) Citibank"+"\n"+"3) HDFC Bank"+"\n"+"4) ICICI Bank"+"\n"+"5) End Program");
            int opt=sc.nextInt();
            boolean repeat;
                switch (opt) {
                    case 1:
                        b=new Bank();
                        System.out.println("Default Bank's Rate of Interest: " + b.getRateofInterest());
                        break;
                    case 2:
                        b=new Citibank();
                        System.out.println("Citibank's Rate of Interest: "+b.getRateofInterest());
                        break;
                    case 3:
                        b=new HDFC();  
                        System.out.println("HDFC Bank's Rate of Interest: "+b.getRateofInterest());  
                        break;
                    case 4:
                        b=new ICICI();  
                        System.out.println("ICICI Bank's Rate of Interest: "+b.getRateofInterest());  
                        break;
                    case 5:
                        System.out.println("Exiting the program! Thank you");
                        break outer;
                    default: System.out.println("Incorrect option provided! Try Again");
                    }
            }
        }
}
